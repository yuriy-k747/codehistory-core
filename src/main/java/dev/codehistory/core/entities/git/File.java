package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;

import java.io.Serializable;

public class File extends IdEntity implements Serializable {
  private transient String path;
  private String name;

  public File() {
  }

  public File(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getDirPath() {
    return path.split("/")[0];
  }

  public String getName() {
    if(name == null) {
      name = new java.io.File(path).getName();
    }
    
    return name;
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
    if (!(obj instanceof File)) {
      return false;
    }

    File wrapper = (File) obj;
    return wrapper.getPath().equals(getPath());
  }
}
