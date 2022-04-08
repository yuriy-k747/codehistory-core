package dev.codehistory.core.entities.sources;

public class ChangeStats {
  
  private Integer added = 0;
  private Integer changed = 0;
  private Integer deleted = 0;
  private Integer movedFrom = 0;
  private Integer movedTo = 0;
  
  public void add(ChangeStats stats) {
    added += stats.added;
    changed += stats.changed;
    deleted += stats.deleted;
  }
  
  public Integer getMovedTotal() {
    return movedFrom + movedTo;
  }
  
  public boolean hasData() {
    return added != 0 || changed != 0 || deleted != 0;
  }
  
  public Integer getAdded() {
    return added;
  }
  
  public void setAdded(Integer added) {
    this.added = added;
  }
  
  public Integer getChanged() {
    return changed;
  }
  
  public void setChanged(Integer changed) {
    this.changed = changed;
  }
  
  public Integer getDeleted() {
    return deleted;
  }
  
  public void setDeleted(Integer deleted) {
    this.deleted = deleted;
  }
  
  public Integer getTotal() {
    return added + changed + deleted;
  }
  
  public Integer getMovedFrom() {
    return movedFrom;
  }
  
  public void setMovedFrom(Integer movedFrom) {
    this.movedFrom = movedFrom;
  }
  
  public Integer getMovedTo() {
    return movedTo;
  }
  
  public void setMovedTo(Integer movedTo) {
    this.movedTo = movedTo;
  }
}
