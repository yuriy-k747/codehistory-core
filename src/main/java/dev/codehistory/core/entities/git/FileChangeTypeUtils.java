package dev.codehistory.core.entities.git;

public class FileChangeTypeUtils {

  private FileChangeTypeUtils() {
    throw new IllegalStateException("FileChangeTypeUtils is utils");
  }

  public static int convert(FileChangeType type) {
    switch (type) {
      case CREATED:
        return 1;
      case CHANGED:
        return 2;
      case RENAMED:
        return 3;
      case COPIED:
        return 4;
      case DELETED:
        return 5;
      default:
        throw new IllegalStateException();
    }
  }
  
  public static FileChangeType convert(int type) {
    switch (type) {
      case 1:
        return FileChangeType.CREATED;
      case 2:
        return FileChangeType.CHANGED;
      case 3:
        return FileChangeType.RENAMED;
      case 4:
        return FileChangeType.COPIED;
      case 5:
        return FileChangeType.DELETED;
      default:
        throw new IllegalStateException();
    }
  }
}
