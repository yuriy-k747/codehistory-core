package dev.codehistory.core.entities;

import java.sql.Timestamp;

public interface Outdateable {
  Timestamp getLastUpdate();
  void setLastUpdate(Timestamp lastUpdate);
}
