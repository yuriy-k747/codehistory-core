package dev.codehistory.core.index.sources.parsers.visitors;

import dev.codehistory.core.entities.sources.ModuleUnit;
import dev.codehistory.core.entities.sources.SourcePart;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DefinitionBuilder {
  private final StringBuilder builder;
  private String argList;
  private ParserRuleContext lastAppended;

  public DefinitionBuilder() {
    this.builder = new StringBuilder();
  }

  private DefinitionBuilder(String value) {
    this.builder = new StringBuilder(value);
  }

  public DefinitionBuilder append(ParserRuleContext ruleContext) {
    return append(ruleContext, false);
  }
  
  public DefinitionBuilder appendArgList(ParserRuleContext ruleContext) {
    String text = handleContext(ruleContext);
    argList = text;
    
    return append(text, false);
  }
  
  public DefinitionBuilder appendArgList(ParserRuleContext ruleContext, boolean noIndent) {
    String text = handleContext(ruleContext);
    argList = text;
    
    return append(text, noIndent);
  }
  
  public DefinitionBuilder append(ParserRuleContext ruleContext, boolean noIndent) {
    String last = noIndent ? "" : " ";
    
    String text = handleContext(ruleContext);
    if(text != null) {
      builder.append(text);
      builder.append(last);
    }

    return this;
  }
  
  public DefinitionBuilder copy() {
    return new DefinitionBuilder(builder.toString());
  }
  
  public DefinitionBuilder append(TerminalNode val) {
    return append(val, false);
  }
  
  public DefinitionBuilder append(TerminalNode val, boolean noIndent) {
    String last = noIndent ? "" : " ";
    if(val != null) {
      builder.append(val.getText());
      builder.append(last);
    }
    
    return this;
  }
  
  public DefinitionBuilder appendKeywordPlaceholder() {
    return appendKeywordPlaceholder(false);
  }
  
  public DefinitionBuilder appendKeywordPlaceholder(boolean noIndent) {
    String last = noIndent ? ")" : ") ";
    builder.append("%(").append(ModuleUnit.Keyword).append(last);
    return this;
  }
  
  public DefinitionBuilder appendIdentifierPlaceholder() {
    return appendIdentifierPlaceholder(false);
  }
  
  public DefinitionBuilder appendIdentifierPlaceholder(boolean noIndent) {
    String last = noIndent ? ")" : ") ";
    builder.append("%(").append(SourcePart.Identifier).append(last);
    return this;
  }
  
  public String flush() {
    lastAppended = null;
    
    if(builder.length() > 0 && builder.charAt(builder.length() - 1) == ' ') {
      builder.setLength(builder.length() - 1);
    }
    
    String res = builder.toString();
    builder.setLength(0);
    
    return res;
  }
  
  @Override
  public String toString() {
    return builder.toString();
  }
  
  public String getArgList() {
    return argList == null ? "" : argList;
  }
  
  private DefinitionBuilder append(String text, boolean noIndent) {
    String last = noIndent ? "" : " ";
    
    if(text != null) {
      builder.append(text);
      builder.append(last);
    }
    
    return this;
  }
  
  private String handleContext(ParserRuleContext ruleContext) {
    if(ruleContext != null) {
      lastAppended = ruleContext;
      
      int a = ruleContext.start.getStartIndex();
      int b = ruleContext.stop.getStopIndex();
      Interval interval = new Interval(a,b);
  
      String text = null;
      text = ruleContext.start.getInputStream().getText(interval);
      
      text = text.replace("\r", "");
      text = text.replace("\n", "");
      text = text.replace("\t", "");
      text = text.replaceAll(" +", " ");
    
      return text;
    } else {
      return null;
    }
  }
  
  public ParserRuleContext getLastAppended() {
    return lastAppended;
  }
}
