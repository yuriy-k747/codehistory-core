package dev.codehistory.core.index.sources.parsers;

import dev.codehistory.core.exceptions.CodeHistoryParseException;
import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.generated.java.JavaLexer;
import dev.codehistory.core.index.sources.generated.java.JavaParser;
import dev.codehistory.core.index.sources.parsers.errors.*;
import dev.codehistory.core.index.sources.parsers.visitors.JavaVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.input.BOMInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.BitSet;

public class JavaParserMain extends Parser {
  private static final Logger log = LoggerFactory.getLogger(JavaParserMain.class);

  public JavaParserMain(String path, LocalSourceIndexData sourceIndexData) {
    super(path, sourceIndexData);
  }

  @Override
  public void parse(InputStream inputStream) throws IOException {
    try (BOMInputStream bomInputStream = new BOMInputStream(inputStream)) {
      ByteOrderMark bom = bomInputStream.getBOM();
      String charsetName = bom == null ? "UTF-8" : bom.getCharsetName();
      try (InputStreamReader reader = new InputStreamReader(new BufferedInputStream(bomInputStream), charsetName)) {
        ParseTree parseTree = getJavaCompilationUnitNode(reader);
        JavaVisitor visitor = new JavaVisitor(this.getData());
        try {
          visitor.visit(parseTree);
        } catch (CodeHistoryParseException e) {
          String message = String.format("Failed to parse \"%s\"", this.path);
          criticalErrors.add(new CodeHistoryParseCodeHistoryError(message));
          log.error(message);
        }
      }
    }

  }

  @Override
  public void compileCriticalErrors() {
    // make up my mind what to do with it
    // now ignoring
  }

  private ParseTree getJavaCompilationUnitNode(InputStreamReader reader) throws IOException {
    CharStream input = CharStreams.fromReader(reader);
    Lexer lexer = new JavaLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    JavaParser parser =  new JavaParser(tokens);
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

    return parser.compilationUnit();
  }
}
