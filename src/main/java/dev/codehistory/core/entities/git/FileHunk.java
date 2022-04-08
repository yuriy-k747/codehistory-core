package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;

import java.util.ArrayList;
import java.util.List;

public class FileHunk extends IdEntity {
  private Long startLine;
  private Long lineCount;
  private File file;
  private Long fileId;
  private Commit commit;
  private Long commitId;
  private List<FileEdit> fileEdits = new ArrayList<>(16);

  public Long getStartLine() {
    return startLine;
  }

  public void setStartLine(long startLine) {
    this.startLine = startLine;
  }

  public Long getLineCount() {
    return lineCount;
  }

  public void setLineCount(long lineCount) {
    this.lineCount = lineCount;
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

  public List<FileEdit> getFileEdits() {
    return fileEdits;
  }

  public void setFileEdits(List<FileEdit> fileEdits) {
    this.fileEdits = fileEdits;
  }

  public Integer getLinesInserted() {
    return fileEdits.stream()
        .map(FileEdit::linesInserted)
        .mapToInt(Integer::intValue)
        .sum();
  }

  public Integer getLinesDeleted() {
    return fileEdits.stream()
        .map(FileEdit::linesDeleted)
        .mapToInt(Integer::intValue)
        .sum();
  }

  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public Long getCommitId() {
    return commitId;
  }

  public void setCommitId(Long commitId) {
    this.commitId = commitId;
  }
}
