package dev.codehistory.core.entities.issues;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.util.ComplexIds;

import java.io.Serializable;

public class IssueUser extends IdEntity implements Serializable {
  private String externalKey;
  private String name = "";
  private String userName = "";
  private String emailAddress = "";
  private Long gitAuthorId;

  public String getComplexId() {
    return ComplexIds.forGitAuthor_IssueUser(gitAuthorId, getId());
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
    this.emailAddress = emailAddress;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getExternalKey().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof IssueUser)) {
      return false;
    }

    IssueUser wrapper = (IssueUser) obj;
    return wrapper.getExternalKey().equals(getExternalKey());
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getExternalKey() {
    return externalKey;
  }

  public void setExternalKey(String externalKey) {
    this.externalKey = externalKey;
  }

  public Long getGitAuthorId() {
    return gitAuthorId;
  }

  public void setGitAuthorId(Long gitAuthorId) {
    this.gitAuthorId = gitAuthorId;
  }
}
