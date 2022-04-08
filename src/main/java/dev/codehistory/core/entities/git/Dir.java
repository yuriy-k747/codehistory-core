package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;

import java.io.Serializable;

public class Dir extends IdEntity implements Serializable {
  private transient String path;

  public Dir() {
  }

  public Dir(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public String toString() {
    return getPath();
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getPath().hashCode();

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Dir)) {
      return false;
    }

    Dir wrapper = (Dir) obj;

    return wrapper.getPath().equals(getPath());
  }
}
