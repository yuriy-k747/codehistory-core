package dev.codehistory.core.entities.diff;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class DiffString extends Diff {
  private final String newContent;
  private final String oldContent;

  public DiffString(DiffKey key, String newContent) {
    super(key);
    this.newContent = newContent;
    this.oldContent = null;
  }

  public DiffString(DiffKey key, String newContent, String oldContent) {
    super(key);
    this.newContent = newContent;
    this.oldContent = oldContent;
  }

  @Override
  public DiffBody openDiffBody() throws IOException {
    return new DiffBody() {
      private final InputStream newStream = IOUtils.toInputStream(newContent, StandardCharsets.UTF_8);
      private final InputStream oldStream = oldContent == null ? null : IOUtils.toInputStream(oldContent, StandardCharsets.UTF_8);
      
      @Override
      public InputStream getOld() {
        return oldStream;
      }

      @Override
      public InputStream getNew() {
        return newStream;
      }

      @Override
      public void close() throws IOException {
        close(this.newStream, this.oldStream);
      }
    };
  }

  @Override
  public boolean isNewEmpty() {
    return newContent == null || newContent.isEmpty();
  }

  @Override
  public boolean isOldEmpty() {
    return oldContent == null || oldContent.isEmpty();
  }

  public String getNewContent() {
    return newContent;
  }

  public String getOldContent() {
    return oldContent;
  }
}
