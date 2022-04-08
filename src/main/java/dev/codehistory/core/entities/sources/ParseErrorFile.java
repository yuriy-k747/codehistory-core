package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.entities.git.File;

public class ParseErrorFile extends IdEntity {
  private Long fileId;
  private File file;
  private Long commitId;
  private Commit commit;

  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

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
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getFile().hashCode();
    result = 23 * result + getCommit().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof ParseErrorFile)) {
      return false;
    }

    ParseErrorFile wrapper = (ParseErrorFile) obj;
    return wrapper.getFile().equals(getFile())
        && wrapper.getCommit().equals(getCommit());
  }
}
