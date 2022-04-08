package dev.codehistory.core.index.sources.parsers.errors;

public class CodeHistoryParseCodeHistoryError extends CodeHistoryError {
  private final String message;

  public CodeHistoryParseCodeHistoryError(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
