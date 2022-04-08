package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;
import org.eclipse.jgit.lib.ObjectId;

import java.io.Serializable;

public class CommitFileChange extends IdEntity implements Serializable {
  private transient Commit commit;
  private Long commitId;
  private Commit commitParent;
  private Long commitParentId;
  private transient File file;
  private Long fileId;
  private FileChangeType changeType;
  private transient File oldRenamedFile;
  private Long oldRenamedFileId;
  private transient File oldCopiedFile;
  private ObjectId oldId;
  private ObjectId newId;
  private Integer linesAdded;
  private Integer linesDeleted;
  private Integer linesChanged;

  public FileChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(FileChangeType changeType) {
    this.changeType = changeType;
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public Commit getCommit() {
    return commit;
  }

  public void setCommit(Commit commit) {
    this.commit = commit;
  }

  @Override
  public String toString() {
    if(getCommit() == null) {
      return getId().toString();
    }

    return String.format("%s: %s", getCommit().toString(), getFile().toString());
  }

  public File getOldRenamedFile() {
    return oldRenamedFile;
  }

  public void setOldRenamedFile(File oldRenamedFile) {
    this.oldRenamedFile = oldRenamedFile;
  }

  public File getOldCopiedFile() {
    return oldCopiedFile;
  }

  public void setOldCopiedFile(File oldCopiedFile) {
    this.oldCopiedFile = oldCopiedFile;
  }

  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public Long getOldRenamedFileId() {
    return oldRenamedFileId;
  }

  public void setOldRenamedFileId(Long oldRenamedFileId) {
    this.oldRenamedFileId = oldRenamedFileId;
  }

  public Long getCommitId() {
    return commitId;
  }

  public void setCommitId(Long commitId) {
    this.commitId = commitId;
  }

  public Commit getCommitParent() {
    return commitParent;
  }

  public void setCommitParent(Commit commitParent) {
    this.commitParent = commitParent;
  }

  public Long getCommitParentId() {
    return commitParentId;
  }

  public void setCommitParentId(Long commitParentId) {
    this.commitParentId = commitParentId;
  }

  public ObjectId getOldId() {
    return oldId;
  }

  public void setOldId(ObjectId oldId) {
    this.oldId = oldId;
  }

  public ObjectId getNewId() {
    return newId;
  }

  public void setNewId(ObjectId newId) {
    this.newId = newId;
  }

  public Integer getLinesAdded() {
    return linesAdded;
  }

  public void setLinesAdded(Integer linesAdded) {
    this.linesAdded = linesAdded;
  }

  public Integer getLinesDeleted() {
    return linesDeleted;
  }

  public void setLinesDeleted(Integer linesDeleted) {
    this.linesDeleted = linesDeleted;
  }

  public Integer getLinesChanged() {
    return linesChanged;
  }

  public void setLinesChanged(Integer linesChanged) {
    this.linesChanged = linesChanged;
  }
}
