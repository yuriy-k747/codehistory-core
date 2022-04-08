package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;

import java.io.Serializable;

public class FileEdit extends IdEntity implements Serializable {
  private transient FileEditType type;
  private transient Integer beginA = 0;
  private transient Integer endA = 0;
  private transient Integer beginB = 0;
  private transient Integer endB = 0;
  private transient FileHunk fileHunk;
  private Long fileHunkId;

  public FileEditType getType() {
    return type;
  }

  public void setType(FileEditType type) {
    this.type = type;
  }

  public Integer getBeginB() {
    return beginB;
  }

  public void setBeginB(Integer beginB) {
    this.beginB = beginB;
  }

  public Integer getEndB() {
    return endB;
  }

  public void setEndB(Integer endB) {
    this.endB = endB;
  }

  public FileHunk getFileHunk() {
    return fileHunk;
  }

  public void setFileHunk(FileHunk fileHunk) {
    this.fileHunk = fileHunk;
  }

  public Integer getBeginA() {
    return beginA;
  }

  public void setBeginA(Integer beginA) {
    this.beginA = beginA;
  }

  public Integer getEndA() {
    return endA;
  }

  public void setEndA(Integer endA) {
    this.endA = endA;
  }

  public Integer linesDeleted() {
    return endA - beginA;
  }

  public Integer linesInserted() {
    return endB - beginB;
  }

  public Long getFileHunkId() {
    return fileHunkId;
  }

  public void setFileHunkId(Long fileHunkId) {
    this.fileHunkId = fileHunkId;
  }
}
