package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;
import org.eclipse.jgit.lib.ObjectId;

public class Branch extends IdEntity {
  private ObjectId objectId;
  private ObjectId targetId;
  private String name;
  private Commit targetCommit;

  public String getSha1(){
    return objectId.getName();
  }

  public ObjectId getObjectId() {
    return objectId;
  }

  public void setObjectId(ObjectId objectId) {
    this.objectId = objectId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShortName() {
    String[] parts = getName().split("/");
    return parts[parts.length - 1];
  }
  
  public String getPrefix() {
    String[] parts = getName().split("/");
    if(parts.length < 2 || parts[1].equals("heads")) {
      return "local/";
    }

    StringBuilder builder = new StringBuilder();
    for(int i = 1; i < parts.length - 1; i++)
    {
      builder.append(parts[i]);
      if(i != (parts.length - 1)) {
        builder.append('/');
      }
    }

    return builder.toString();
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getName().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Branch)) {
      return false;
    }

    Branch wrapper = (Branch) obj;
    return wrapper.getName().equals(getName());
  }
  
  @Override
  public String toString() {
    return name;
  }
  
  public ObjectId getTargetId() {
    return targetId;
  }

  public void setTargetId(ObjectId targetId) {
    this.targetId = targetId;
  }
  
  public Commit getTargetCommit() {
    return targetCommit;
  }
  
  public void setTargetCommit(Commit targetCommit) {
    this.targetCommit = targetCommit;
  }
}
