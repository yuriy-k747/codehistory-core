package dev.codehistory.core.index.sources;

import dev.codehistory.core.ExecutionTime;
import dev.codehistory.core.entities.diff.Diff;
import dev.codehistory.core.entities.diff.DiffBody;
import dev.codehistory.core.entities.diff.Pack;
import dev.codehistory.core.entities.diff.SourceType;
import org.eclipse.jgit.errors.MissingObjectException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ChangesCompiler {
  private Long lastParsingDuration = 0L;

  public List<CompileResult> compileDiff(Pack pack) {
    return compileDiff(pack, System.out::println);
  }

  public List<CompileResult> compileDiff(Pack pack, Consumer<String> logging)  {
    ArrayList<CompileResult> compilationResults = new ArrayList<>(pack.getDiffs().size());

    for (Diff diff : pack.getDiffs()) {
      if (diff.getKey().getType().equals(SourceType.NOT_SUPPORTED)) {
        continue;
      }

      String newPath = diff.getKey().getNew();
      String oldPath = diff.getKey().getOld();
      SourceFileDiffCompiler sourceFileDiffCompiler = new SourceFileDiffCompiler(newPath, oldPath);

      CompileResult res = null;
      try {
        res = compile(sourceFileDiffCompiler, diff);
      } catch (MissingObjectException e) {
        logging.accept(String.format("MissingObjectException: \"%s\" while processing new: \"%s\", old: \"%s\")",
            e.getMessage(), newPath, oldPath));
      } catch (Exception e) {
        logging.accept(String.format("Exception: \"%s\" while processing new: \"%s\", old: \"%s\"",
            e.getMessage(), newPath, oldPath));
      }

      if (res != null) {
        res.setFilePath(!diff.isNewEmpty() ? newPath : oldPath);
        compilationResults.add(res);
      }
    }

    return compilationResults;
  }

  protected CompileResult compile(SourceFileDiffCompiler sourceFileDiffCompiler, Diff diff) throws IOException {
    try(DiffBody body = diff.openDiffBody()) {
      ExecutionTime time = ExecutionTime.start();
      CompileResult res = sourceFileDiffCompiler.compile(diff.getKey().getType(), body.getNew(), body.getOld(), diff.getDiffHint());
      this.lastParsingDuration = time.stop();
      return res;
    }
  }

  public Long getLastParsingDuration() {
    return lastParsingDuration;
  }
}
