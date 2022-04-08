package dev.codehistory.core.entities.diff;

import java.io.IOException;

public abstract class Diff {
  private final DiffKey key;

  protected Diff(DiffKey key) {
    this.key = key;
  }

  public abstract DiffBody openDiffBody() throws IOException;

  public abstract boolean isNewEmpty();

  public abstract boolean isOldEmpty();

  public DiffKey getKey() {
    return key;
  }
}
