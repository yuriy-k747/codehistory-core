package dev.codehistory.core.entities.diff;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public interface DiffBody extends Closeable {
  InputStream getOld();
  InputStream getNew();

  default void close(InputStream newStream, InputStream oldStream) throws IOException {
    if(newStream != null) {
      newStream.close();
    }

    if(oldStream != null) {
      oldStream.close();
    }
  }
}
