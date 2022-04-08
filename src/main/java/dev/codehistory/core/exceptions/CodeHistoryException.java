package dev.codehistory.core.exceptions;

public class CodeHistoryException extends IllegalStateException {
  public CodeHistoryException(String message) {
    super(message);
  }

  public CodeHistoryException(String message, Throwable cause) {
    super(message, cause);
  }
}
