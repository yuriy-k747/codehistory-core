package dev.codehistory.core.entities.git;

import java.io.Serializable;

public enum FileEditType implements Serializable {
  INSERT,
  DELETE,
  REPLACE,
}
