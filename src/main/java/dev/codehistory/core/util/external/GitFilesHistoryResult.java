package dev.codehistory.core.util.external;

import org.eclipse.jgit.revwalk.RevCommit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GitFilesHistoryResult {
  private final Set<RevCommit> commits;
  private final Map<String, Set<String>> filePathsWithRenames = new HashMap<>();
  
  public GitFilesHistoryResult(Set<RevCommit> commits) {
    this.commits = commits;
  }
  
  public Set<RevCommit> getCommits() {
    return commits;
  }
  
  public Map<String, Set<String>> getFilePathsWithRenames() {
    return filePathsWithRenames;
  }
  
  public Set<String> getAllFilePaths() {
    Set<String> res = new HashSet<>();
    for (Set<String> value : filePathsWithRenames.values()) {
      res.addAll(value);
    }
    
    return res;
  }
}
