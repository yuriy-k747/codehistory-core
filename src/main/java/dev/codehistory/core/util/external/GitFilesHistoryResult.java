package dev.codehistory.core.util.external;

import java.util.HashMap;
import java.util.Map;

public class GitFilesHistoryResult {
  private final Map<String, GitFilesHistory> filesHistory = new HashMap<>();
  
  public Map<String, GitFilesHistory> getFilesHistory() {
    return filesHistory;
  }
}
