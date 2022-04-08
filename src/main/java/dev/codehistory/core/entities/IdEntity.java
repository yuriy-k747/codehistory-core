package dev.codehistory.core.entities;

public abstract class IdEntity {
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
