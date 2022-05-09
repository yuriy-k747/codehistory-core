package dev.codehistory.core.entities.diff;

import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;

import java.io.IOException;

public class DiffObjectId extends Diff {
  private final Repository repository;
  private final ObjectId newId;
  private final ObjectId oldId;

  public DiffObjectId(DiffKey key, Repository repository, ObjectId newId, ObjectId oldId, DiffHint diffHint) {
    super(key, diffHint);
    this.repository = repository;
    this.newId = newId;
    this.oldId = oldId;
  }

  @Override
  public DiffBody openDiffBody() throws IOException {
    return new BodyObjectId(repository, newId, oldId);
  }

  @Override
  public boolean isNewEmpty() {
    return newId == null || newId.equals(ObjectId.zeroId());
  }

  @Override
  public boolean isOldEmpty() {
    return oldId == null || oldId.equals(ObjectId.zeroId());
  }

  public ObjectId getNewId() {
    return this.newId;
  }

  public ObjectId getOldId() {
    return this.oldId;
  }
}
