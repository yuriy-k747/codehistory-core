package dev.codehistory.core.util.external;

import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.revwalk.RenameCallback;

import java.util.HashSet;
import java.util.Set;

public class GitFileHistoryRenameCallback extends RenameCallback {
  private final String rootPath;
  private final Set<String> renames = new HashSet<>();
  
  public GitFileHistoryRenameCallback(String rootPath) {
    this.rootPath = rootPath;
  }
  
  @Override
  public void renamed(DiffEntry entry) {
    renames.add(entry.getNewPath());
    renames.add(entry.getOldPath());
  }
  
  public Set<String> getRenames() {
    return renames;
  }
  
  public String getRootPath() {
    return rootPath;
  }
}
