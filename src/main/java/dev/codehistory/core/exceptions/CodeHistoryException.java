package dev.codehistory.core.exceptions;

import org.eclipse.jgit.annotations.Nullable;

public class CodeHistoryException extends RuntimeException {
  public CodeHistoryException() {
    super();
  }

  public CodeHistoryException(String msg) {
    super(msg);
  }

  public CodeHistoryException(String msg, @Nullable Throwable cause) {
    super(msg, cause);
  }

  public CodeHistoryException(String msg, @Nullable Throwable cause, boolean withStackTrace) {
    super(msg, cause, !withStackTrace, withStackTrace);
  }
}
