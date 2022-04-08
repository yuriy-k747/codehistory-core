package dev.codehistory.core.entities.sources;

import dev.codehistory.core.CommitEntity;

public class SourceChange extends CommitEntity {
  private SourceState sourceState;

  public int geLinesCount() {
    return sourceState.getEndLine() - sourceState.getStartLine() + 1;
  }
  
  public SourceState getSourceState() {
    return sourceState;
  }

  public void setSourceState(SourceState sourceState) {
    this.sourceState = sourceState;
  }
}
