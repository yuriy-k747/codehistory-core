package dev.codehistory.core.entities.sources;

import dev.codehistory.core.CommitEntity;
import dev.codehistory.core.entities.git.File;

public class SourceChange extends CommitEntity {
  private SourceState sourceState;
  private File file;

  public int geLinesCount() {
    return sourceState.getEndLine() - sourceState.getStartLine() + 1;
  }
  
  public SourceState getSourceState() {
    return sourceState;
  }

  public void setSourceState(SourceState sourceState) {
    this.sourceState = sourceState;
  }
  
  public File getFile() {
    return file;
  }
  
  public void setFile(File file) {
    this.file = file;
  }
}
