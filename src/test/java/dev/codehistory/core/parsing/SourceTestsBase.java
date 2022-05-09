package dev.codehistory.core.parsing;

import dev.codehistory.core.entities.diff.DiffHint;
import dev.codehistory.core.entities.diff.SourceType;
import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.index.sources.CompileResult;
import dev.codehistory.core.index.sources.SourceFileDiffCompiler;
import org.apache.commons.lang3.tuple.Pair;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class SourceTestsBase {
  protected Pair<List<ModuleUnitChange>, List<ModuleUnitMemberChange>> compileChanges(SourceType type, String oldPath, String newPath) throws IOException {
    try (InputStream newStream = loadFileStream(newPath)) {
      try (InputStream oldStream = loadFileStream(oldPath)) {
        SourceFileDiffCompiler compilatorOfFileChange = new SourceFileDiffCompiler(newPath, oldPath);
        CompileResult res = compilatorOfFileChange.compile(type, newStream, oldStream, DiffHint.NONE);

        return Pair.of(res.getModuleUnitChanges(), res.getModuleUnitMemberChanges());
      }
    }
  }

  protected Pair<List<ModuleUnitChange>, List<ModuleUnitMemberChange>> compileAllNew(SourceType type, String newPath) throws IOException {
    try (InputStream newStream = loadFileStream(newPath)) {
      SourceFileDiffCompiler compilatorOfFileChange = new SourceFileDiffCompiler(newPath, null);
      CompileResult res = compilatorOfFileChange.compile(type, newStream, null, DiffHint.NONE);

      return Pair.of(res.getModuleUnitChanges(), res.getModuleUnitMemberChanges());
    }
  }

  protected InputStream loadFileStream(String path) throws FileNotFoundException {
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(Objects.requireNonNull(classLoader.getResource(path)).getFile());
    return new FileInputStream(file);
  }
}
