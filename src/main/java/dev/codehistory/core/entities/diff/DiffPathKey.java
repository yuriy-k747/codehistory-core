package dev.codehistory.core.entities.diff;

public class DiffPathKey extends DiffKey {

  public DiffPathKey(String old, String _new) {
    super(getTypeByExt(_new), old, _new);
  }

  public DiffPathKey(String key) {
    super(getTypeByExt(key), key);
  }

  private static SourceType getTypeByExt(String path) {
    if(path == null || path.isEmpty()) {
      return SourceType.NOT_SUPPORTED;
    }

    if (path.endsWith(".cs")) {
      return SourceType.CSHARP;
    } else if(path.endsWith(".java")) {
      return SourceType.JAVA;
    }

    return SourceType.NOT_SUPPORTED;
  }
}
