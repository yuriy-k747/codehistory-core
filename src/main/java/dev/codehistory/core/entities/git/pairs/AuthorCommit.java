package dev.codehistory.core.entities.git.pairs;

import dev.codehistory.core.entities.git.GitAuthor;
import dev.codehistory.core.entities.git.Commit;

public class AuthorCommit {
  private final GitAuthor author;
  private final Commit commit;

  public AuthorCommit(GitAuthor author, Commit commit) {
    this.author = author;
    this.commit = commit;
  }

  public GitAuthor getAuthor() {
    return author;
  }

  public Commit getCommit() {
    return commit;
  }
}
