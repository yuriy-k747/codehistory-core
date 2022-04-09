package dev.codehistory.core.sources;

import dev.codehistory.core.entities.diff.*;
import dev.codehistory.core.index.sources.ChangesCompiler;
import dev.codehistory.core.index.sources.CompileResult;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SourceMultiChangeTests extends SourceIndexTestsBase {
  @Test
  public void function_addedDeletedTest() {
    final String TestClass =
        "package com.ch.tests;\r\n" +
            "class TestClass1 { " +
            "}";

    final String TestClass2 =
        "package com.ch.tests;\r\n" +
            "class TestClass2 { " +
            " public void foo();" +
            "}";

    final String TestClass3 =
        "package com.ch.tests;\r\n" +
            "class TestClass3 { " +
            " public void foo();" +
            "}";

    Pack pack = new Pack();
    pack.getDiffs().add(new DiffString(new DiffKey(SourceType.JAVA, "TestClass1"), TestClass));
    pack.getDiffs().add(new DiffString(new DiffKey(SourceType.JAVA, "TestClass2"), TestClass2));
    pack.getDiffs().add(new DiffString(new DiffKey(SourceType.JAVA, "TestClass3"), TestClass3));

    ChangesCompiler compiler = new ChangesCompiler();
    List<CompileResult> results = compiler.compileDiff(pack);

    Assert.assertEquals(3, results.size());
  }
}
