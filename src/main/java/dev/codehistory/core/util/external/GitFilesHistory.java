package dev.codehistory.core.util.external;

import org.eclipse.jgit.revwalk.RevCommit;

import java.util.HashSet;
import java.util.Set;

public class GitFilesHistory {
  private final Set<String> renames = new HashSet<>();
  private final Set<RevCommit> commits;
  
  public GitFilesHistory(Set<RevCommit> commits) {
    this.commits = commits;
  }
  
  public Set<String> getRenames() {
    return renames;
  }
  
  public Set<RevCommit> getCommits() {
    return commits;
  }
}
