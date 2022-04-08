package dev.codehistory.core.sources;

import dev.codehistory.core.entities.diff.*;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.sources.CompileResult;
import dev.codehistory.core.index.sources.ChangesCompiler;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class SourceAddedIndexTests extends SourceIndexTestsBase {
  @Test
  public void unitAdded_functionAdded() {
    Pack pack = new Pack();
    Diff diff = new DiffString(new DiffKey(SourceType.JAVA, "MyClass"), SourceIndexTestsBase.MyClass_newContent);
    pack.getDiffs().add(diff);

    ChangesCompiler compiler = new ChangesCompiler();
    List<CompileResult> results = compiler.compileDiff(pack);

    assertResults(results, 1, 1, 1);
    assert_MyClass_memberChangeType(results, ModuleUnitChangeType.ADDED, ModuleUnitMemberChangeType.ADDED);
  }

  @Test
  public void unitAdded_functionsAdded() {
    final String TestClass_content =
        "package com.ch.tests;\r\n" +
            "class TestClass { " +
            " public void foo();" +
            " public void bar();" +
            "}";

    Pack pack = new Pack();
    Diff diff = new DiffString(new DiffKey(SourceType.JAVA, "TestClass"), TestClass_content);
    pack.getDiffs().add(diff);

    ChangesCompiler compiler = new ChangesCompiler();
    List<CompileResult> results = compiler.compileDiff(pack);

    assertResults(results, 1, 1, 2);

    CompileResult result = results.get(0);

    List<ModuleUnitMemberChange> changes1 = result.findMemberChanges("com.ch.tests", "TestClass", "foo");
    List<ModuleUnitMemberChange> changes2 = result.findMemberChanges("com.ch.tests", "TestClass", "bar");

    Assertions.assertEquals(1, changes1.size());
    Assertions.assertEquals(1, changes2.size());

    Assertions.assertEquals(ModuleUnitMemberChangeType.ADDED, changes1.get(0).getChangeType());
    Assertions.assertEquals(ModuleUnitMemberChangeType.ADDED, changes2.get(0).getChangeType());

    Assertions.assertEquals("foo", changes1.get(0).getModuleUnitMember().getIdentifier());
    Assertions.assertEquals("bar", changes2.get(0).getModuleUnitMember().getIdentifier());
  }
}
