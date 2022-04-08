package dev.codehistory.core.sources;

import dev.codehistory.core.entities.diff.*;
import dev.codehistory.core.entities.sources.ModuleUnitChangeType;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChangeType;
import dev.codehistory.core.index.sources.ChangesCompiler;
import dev.codehistory.core.index.sources.CompileResult;
import org.junit.Test;

import java.util.List;

public class SourceDeletedIndexTests extends SourceIndexTestsBase {
  @Test
  public void unitChanged_functionDeleted() {
    Pack pack = new Pack();
    Diff diff = new DiffString(new DiffKey(SourceType.JAVA, "MyClass"), SourceIndexTestsBase.MyClass_oldContent, SourceIndexTestsBase.MyClass_newContent);
    pack.getDiffs().add(diff);

    ChangesCompiler compiler = new ChangesCompiler();
    List<CompileResult> results = compiler.compileDiff(pack);

    assertResults(results, 1, 1, 1);
    assert_MyClass_memberChangeType(results, ModuleUnitChangeType.CHANGED, ModuleUnitMemberChangeType.DELETED);
  }
}