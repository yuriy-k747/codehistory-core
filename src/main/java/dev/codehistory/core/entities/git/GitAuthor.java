package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.entities.git.pairs.AuthorCommit;

import java.io.Serializable;
import java.util.*;

public class GitAuthor extends IdEntity implements Serializable {
  private transient String name;
  private transient String emailAddress;
  private transient Collection<Commit> commits = new HashSet<>();

  private Set<Long> commitsIds = new HashSet<>();
  
  public GitAuthor() {
  }

  public GitAuthor(String name, String emailAddress) {
    this.name = name;
    this.emailAddress = emailAddress.toLowerCase();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress.toLowerCase();
  }

  public Collection<Commit> getCommits() {
    return commits;
  }

  public void setCommits(Collection<Commit> commits) {
    this.commits = commits;
  }

  @Override
  public String toString() {
    return String.format("%s<%s>", getName(), getEmailAddress());
  }

  public List<AuthorCommit> toAuthorCommits() {
    List<AuthorCommit> authorCommits = new ArrayList<>(getCommits().size());
    Commit[] commitArray = getCommits().toArray(new Commit[0]);
    for (int i = 0; i < commitArray.length; i++) {
      authorCommits.add(new AuthorCommit(this, commitArray[i]));
    }

    return authorCommits;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getName().hashCode();
    result = 23 * result + getEmailAddress().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof GitAuthor)) {
      return false;
    }

    GitAuthor wrapper = (GitAuthor) obj;
    return wrapper.getName().equals(getName()) &&
        wrapper.getEmailAddress().equals(getEmailAddress());
  }
  
  public Set<Long> getCommitsIds() {
    return commitsIds;
  }
}
