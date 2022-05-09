package dev.codehistory.core.entities.diff;

import java.io.IOException;

public abstract class Diff {
  private final DiffKey key;
  private final DiffHint diffHint;
  
  protected Diff(DiffKey key, DiffHint diffHint) {
    this.key = key;
    this.diffHint = diffHint;
  }

  public abstract DiffBody openDiffBody() throws IOException;

  public abstract boolean isNewEmpty();

  public abstract boolean isOldEmpty();

  public DiffKey getKey() {
    return key;
  }
  
  public DiffHint getDiffHint() {
    return diffHint;
  }
}
