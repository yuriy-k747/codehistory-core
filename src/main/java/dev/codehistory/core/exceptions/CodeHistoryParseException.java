package dev.codehistory.core.exceptions;

public class CodeHistoryParseException extends CodeHistoryException {
  public CodeHistoryParseException(String message) {
    super(message);
  }

  public CodeHistoryParseException(String message, Throwable cause) {
    super(message, cause);
  }
}
