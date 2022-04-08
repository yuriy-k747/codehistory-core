package dev.codehistory.core.index.sources.parsers.errors;

public class SyntaxCodeHistoryError extends CodeHistoryError {
  private final Object offendingSymbol;
  private final int line;
  private final int charPositionInLine;
  private final String msg;

  public SyntaxCodeHistoryError(Object offendingSymbol, int line, int charPositionInLine, String msg) {
    this.offendingSymbol = offendingSymbol;
    this.line = line;
    this.charPositionInLine = charPositionInLine;
    this.msg = msg;
  }

  public Object getOffendingSymbol() {
    return offendingSymbol;
  }

  public int getLine() {
    return line;
  }

  public int getCharPositionInLine() {
    return charPositionInLine;
  }

  public String getMsg() {
    return msg;
  }
}
