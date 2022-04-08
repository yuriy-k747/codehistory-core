package dev.codehistory.core.views;

import dev.codehistory.core.entities.git.Commit;

public interface HasCommit {
  Commit getCommit();
}
