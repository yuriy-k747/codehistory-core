package dev.codehistory.core.entities.git.pairs;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.entities.issues.Issue;

public class CommitIssue {
  private final Commit commit;
  private final Issue issue;

  public CommitIssue(Commit commit, Issue issue) {
    this.commit = commit;
    this.issue = issue;
  }

  public Commit getCommit() {
    return commit;
  }

  public Issue getIssue() {
    return issue;
  }
}
