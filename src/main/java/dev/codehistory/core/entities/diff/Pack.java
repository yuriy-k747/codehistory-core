package dev.codehistory.core.entities.diff;

import java.util.HashSet;
import java.util.Set;

public class Pack {
  private final Set<Diff> diffs = new HashSet<>();

  public Set<Diff> getDiffs() {
    return diffs;
  }
}
