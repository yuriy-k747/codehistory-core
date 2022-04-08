package dev.codehistory.core.commands;

import dev.codehistory.core.index.sources.data.SourceIndexData;

public class FileHistoryResult {
  private final SourceIndexData data;
  
  public FileHistoryResult(SourceIndexData data) {
    this.data = data;
  }
}
