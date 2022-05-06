package dev.codehistory.core.util.external;

import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.TreeFilter;

import java.io.IOException;

public class PathHistoryFilter extends TreeFilter {
  @Override
  public boolean include(TreeWalk walker) throws MissingObjectException, IncorrectObjectTypeException, IOException {
    return false;
  }
  
  @Override
  public boolean shouldBeRecursive() {
    return false;
  }
  
  @Override
  public TreeFilter clone() {
    return null;
  }
}
