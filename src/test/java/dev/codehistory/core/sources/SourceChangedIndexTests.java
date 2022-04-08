package dev.codehistory.core.sources;

import dev.codehistory.core.entities.diff.*;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.sources.ChangesCompiler;
import dev.codehistory.core.index.sources.CompileResult;
import org.junit.Test;

import java.util.List;

public class SourceChangedIndexTests extends SourceIndexTestsBase {
  @Test
  public void unitChanged_functionAdded() {
    Pack pack = new Pack();
    Diff diff = new DiffString(new DiffKey(SourceType.JAVA, "MyClass"), SourceIndexTestsBase.MyClass_newContent, SourceIndexTestsBase.MyClass_oldContent);
    pack.getDiffs().add(diff);

    ChangesCompiler compiler = new ChangesCompiler();
    List<CompileResult> results = compiler.compileDiff(pack);

    assertResults(results, 1, 1, 1);
    assert_MyClass_memberChangeType(results, ModuleUnitChangeType.CHANGED, ModuleUnitMemberChangeType.ADDED);
  }
}
