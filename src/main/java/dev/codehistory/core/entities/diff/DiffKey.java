package dev.codehistory.core.entities.diff;

public class DiffKey {
  private final SourceType type;
  private final String old;
  private final String _new;

  public DiffKey(SourceType type, String key) {
    this.type = type;
    this.old = key;
    this._new = key;
  }

  public DiffKey(SourceType type, String old, String _new) {
    this.type = type;
    this.old = old;
    this._new = _new;
  }

  public String getOld() {
    return old;
  }

  public String getNew() {
    return _new;
  }

  public SourceType getType() {
    return type;
  }
}
