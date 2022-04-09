package dev.codehistory.core.sources;

import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.sources.CompileResult;
import org.junit.Assert;

import java.util.List;

public class SourceIndexTestsBase {
  protected static final String MyClass_oldContent =
      "package com.ch.tests;\r\n" +
          "class MyClass { }";

  protected static final String MyClass_newContent =
      "package com.ch.tests;\r\n" +
          "class MyClass { public void foo() { } }";

  protected void assert_MyClass_memberChangeType(List<CompileResult> results, ModuleUnitChangeType unitChangeType, ModuleUnitMemberChangeType memberChangeType) {
    List<ModuleUnitChange> unitChanges = results.get(0).getModuleUnitChanges();
    ModuleUnitChange unitChange = unitChanges.get(0);

    Assert.assertEquals(unitChangeType, unitChange.getChangeType());
    ModuleUnit moduleUnit = unitChange.getModuleUnit();
    Assert.assertEquals("class", moduleUnit.getKeyword());
    Assert.assertEquals("MyClass", moduleUnit.getIdentifier());

    ModuleUnitMemberChange memberChange = results.get(0).getModuleUnitMemberChanges().get(0);
    Assert.assertEquals(memberChangeType, memberChange.getChangeType());

    ModuleUnitMember member = memberChange.getModuleUnitMember();
    Assert.assertEquals("method", member.getCategory());
    Assert.assertEquals("foo", member.getIdentifier());
  }

  protected void assertResults(List<CompileResult> results, int size, int unitChangesSize, int memberChangesSize) {
    Assert.assertEquals(size, results.size());
    CompileResult result = results.get(0);

    List<ModuleUnitChange> unitChanges = result.getModuleUnitChanges();
    Assert.assertEquals(unitChangesSize, unitChanges.size());

    List<ModuleUnitMemberChange> memberChanges = result.getModuleUnitMemberChanges();
    Assert.assertEquals(memberChangesSize, memberChanges.size());
  }
}
