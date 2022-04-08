package dev.codehistory.core.util;

import dev.codehistory.core.entities.git.GitAuthor;
import dev.codehistory.core.entities.issues.IssueUser;

public class ComplexIds {

  private ComplexIds() {
    throw new IllegalStateException("ComplexIds is utils");
  }

  public static String forGitAuthor_IssueUser(GitAuthor gitAuthor, IssueUser issueUser) {
    String first = gitAuthor == null ? "0" : String.format("%d", gitAuthor.getId());
    String second = issueUser == null ? "0" : String.format("%d", issueUser.getId());

    return first + "," + second;
  }

  public static String forGitAuthor_IssueUser(Long gitAuthor, Long issueUser) {
    String first = gitAuthor == null ? "0" : String.format("%d", gitAuthor);
    String second = issueUser == null ? "0" : String.format("%d", issueUser);

    return first + "," + second;
  }
}
