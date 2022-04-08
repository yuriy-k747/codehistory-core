package dev.codehistory.core.entities.diff;

import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectLoader;
import org.eclipse.jgit.lib.Repository;

import java.io.IOException;
import java.io.InputStream;

public class BodyObjectId implements DiffBody {
  private final InputStream newStream;
  private final InputStream oldStream;

  public BodyObjectId(Repository repository, ObjectId newId, ObjectId oldId) throws IOException {
    ObjectLoader newLoader = newId.equals(ObjectId.zeroId()) ? null : repository.open(newId, Constants.OBJ_BLOB);
    ObjectLoader oldLoader = oldId.equals(ObjectId.zeroId()) ? null : repository.open(oldId, Constants.OBJ_BLOB);
    this.newStream = newLoader == null ? null : newLoader.openStream();
    this.oldStream = oldLoader == null ? null : oldLoader.openStream();
  }

  @Override
  public InputStream getOld() {
    return this.oldStream;
  }

  @Override
  public InputStream getNew() {
    return this.newStream;
  }

  @Override
  public void close() throws IOException {
    close(this.newStream, this.oldStream);
  }
}
