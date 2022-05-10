package dev.codehistory.core;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.entities.git.Commit;

public abstract class CommitEntity extends IdEntity {
  private Long commitId;
  private Long commitParentId;
  private Commit commit;
  private Commit commitParent;
  
  public Long getCommitId() {
    return commitId;
  }
  
  public void setCommitId(Long commitId) {
    this.commitId = commitId;
  }
  
  public Commit getCommit() {
    return commit;
  }
  
  public void setCommit(Commit commit) {
    this.commit = commit;
    this.commitId = commit.getId();
  }
  
  public Long getCommitParentId() {
    return commitParentId;
  }
  
  public void setCommitParentId(Long commitParentId) {
    this.commitParentId = commitParentId;
  }
  
  public Commit getCommitParent() {
    return commitParent;
  }
  
  public void setCommitParent(Commit commitParent) {
    this.commitParent = commitParent;
    this.commitParentId = commitParent.getId();
  }
  
  public void setCommits(Commit commit, Commit commitParent) {
    setCommit(commit);
    setCommitParent(commitParent);
  }
  
  public String getShortSha1() {
    String sha = "";
    if(getCommit() != null) {
      sha = getCommit().getShortSha1() + " ";
    }
    
    return sha;
  }
}
