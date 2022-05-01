package dev.codehistory.core.index.sources.parsers;

import dev.codehistory.core.exceptions.CodeHistoryParseException;
import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.generated.csharp.CSharpLexer;
import dev.codehistory.core.index.sources.generated.csharp.CSharpParser;
import dev.codehistory.core.index.sources.generated.csharp.CSharpPreprocessorParser;
import dev.codehistory.core.index.sources.parsers.errors.*;
import dev.codehistory.core.index.sources.parsers.visitors.CsharpVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.input.BOMInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.function.Consumer;

public class CsharpParser extends Parser {

  public CsharpParser(String path, LocalSourceIndexData sourceIndexData) {
    super(path, sourceIndexData);
  }

  @Override
  public void parse(InputStream inputStream) throws IOException {
    parse(inputStream, System.out::println);
  }

  @Override
  public void parse(InputStream inputStream, Consumer<String> logging) throws IOException {
    try (BOMInputStream bomInputStream = new BOMInputStream(inputStream)) {
      ByteOrderMark bom = bomInputStream.getBOM();
      String charsetName = bom == null ? "UTF-8" : bom.getCharsetName();
      try (InputStreamReader reader = new InputStreamReader(new BufferedInputStream(bomInputStream), charsetName)) {
        ParseTree parseTree = getCSharpCompilationUnitNode(reader);
        CsharpVisitor visitor = new CsharpVisitor(this.getData());
        try {
          visitor.visit(parseTree);
        } catch (CodeHistoryParseException e) {
          String message = String.format("Failed to parse \"%s\"", this.path);
          criticalErrors.add(new CodeHistoryParseCodeHistoryError(message));
          logging.accept(message);
        }
      }
    }
  }

  @Override
  public void compileCriticalErrors() {
    // ignore syntax errors - this approach provides a better result \_/(-_-)\_/. Have to improve grammar.
  }

  private ParseTree getCSharpCompilationUnitNode(InputStreamReader reader) throws IOException {
    CharStream input = CharStreams.fromReader(reader);

    List<? extends Token> preprocessedTokens = processPreprocessor(input);
    ListTokenSource codeTokenSource = new ListTokenSource(preprocessedTokens);
    CommonTokenStream codeTokenStream = new CommonTokenStream(codeTokenSource);

    CSharpParser parser =  new CSharpParser(codeTokenStream);
    parser.removeErrorListeners();

    parser.addErrorListener(new ANTLRErrorListener() {
      @Override
      public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrors.add(new SyntaxCodeHistoryError(offendingSymbol, line, charPositionInLine, msg));
      }

      @Override
      public void reportAmbiguity(org.antlr.v4.runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        ambiguityErrors.add(new AmbiguityCodeHistoryError());
      }

      @Override
      public void reportAttemptingFullContext(org.antlr.v4.runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        attemptingFullContextErrors.add(new AttemptingFullContextCodeHistoryError());
      }

      @Override
      public void reportContextSensitivity(org.antlr.v4.runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        contextSensitivityErrors.add(new ContextSensitivityCodeHistoryError());
      }
    });

    return parser.compilation_unit();
  }

  private List<? extends Token> processPreprocessor(CharStream input) {
    List<Token> codeTokens = new ArrayList<>();
    List<Token> commentTokens = new ArrayList<>();
    Lexer preprocessorLexer = new CSharpLexer(input);
    preprocessorLexer.removeErrorListeners();

    // Collect all tokens with lexer (CSharpLexer.g4).
    List<? extends Token> tokens = preprocessorLexer.getAllTokens();
    ArrayList<Token> directiveTokens = new ArrayList<>();
    ListTokenSource directiveTokenSource = new ListTokenSource(directiveTokens);
    CommonTokenStream directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
    CSharpPreprocessorParser preprocessorParser = new CSharpPreprocessorParser(directiveTokenStream);

    int index = 0;
    boolean compiledTokens = true;
    while (index < tokens.size())
    {
      Token token = tokens.get(index);
      if (token.getType() == CSharpLexer.SHARP)
      {
        directiveTokens.clear();
        int directiveTokenIndex = index + 1;
        // Collect all preprocessor directive tokens.
        while (directiveTokenIndex < tokens.size() &&
            tokens.get(directiveTokenIndex).getType() != Recognizer.EOF &&
            tokens.get(directiveTokenIndex).getType() != CSharpLexer.DIRECTIVE_NEW_LINE &&
            tokens.get(directiveTokenIndex).getType() != CSharpLexer.SHARP)
        {
          if (tokens.get(directiveTokenIndex).getChannel() == CSharpLexer.COMMENTS_CHANNEL)
          {
            commentTokens.add(tokens.get(directiveTokenIndex));
          }
          else if (tokens.get(directiveTokenIndex).getChannel() != Lexer.HIDDEN)
          {
            directiveTokens.add(tokens.get(directiveTokenIndex));
          }
          directiveTokenIndex++;
        }

        directiveTokenSource = new ListTokenSource(directiveTokens);
        directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
        preprocessorParser.setInputStream(directiveTokenStream);
        preprocessorParser.reset();

        // Parse condition in preprocessor directive (based on CSharpPreprocessorParser.g4 grammar).
        CSharpPreprocessorParser.Preprocessor_directiveContext directive = preprocessorParser.preprocessor_directive();

        // if true than next code is valid and not ignored.
        compiledTokens = directive.value;
        String directiveStr = tokens.get(index+1).getText().trim();
        if ("line".equals(directiveStr)
            || "error".equals(directiveStr)
            || "warning".equals(directiveStr)
            || "define".equals(directiveStr)
            || "endregion".equals(directiveStr)
            || "endif".equals(directiveStr)
            || "pragma".equals(directiveStr)) {
          compiledTokens = true;
        }

        String conditionalSymbol = null;
        if ("define".equals(tokens.get(index+1).getText())) {
          // add to the conditional symbols
          conditionalSymbol = tokens.get(index + 2).getText();
          preprocessorParser.ConditionalSymbols.add(conditionalSymbol);
        }
        if ("undef".equals(tokens.get(index+1).getText())) {
          conditionalSymbol = tokens.get(index + 2).getText();
          preprocessorParser.ConditionalSymbols.remove(conditionalSymbol);
        }
        index = directiveTokenIndex - 1;
      }
      else if (token.getChannel() == CSharpLexer.COMMENTS_CHANNEL)
      {
        commentTokens.add(token); // Colect comment tokens (if required).
      }
      else if (token.getChannel() != Lexer.HIDDEN && token.getType() != CSharpLexer.DIRECTIVE_NEW_LINE && compiledTokens)
      {
        codeTokens.add(token); // Collect code tokens.
      }
      index++;
    }

    return codeTokens;
  }
}
