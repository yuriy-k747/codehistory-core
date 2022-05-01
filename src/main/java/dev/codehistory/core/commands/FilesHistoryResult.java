package dev.codehistory.core.commands;

import dev.codehistory.core.index.sources.data.SourceIndexData;

public class FilesHistoryResult {
  private final SourceIndexData data;
  
  public FilesHistoryResult(SourceIndexData data) {
    this.data = data;
  }
}
