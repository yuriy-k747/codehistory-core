package dev.codehistory.core.sources;

import dev.codehistory.core.entities.diff.*;
import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitChangeType;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.index.sources.ChangesCompiler;
import dev.codehistory.core.index.sources.CompileResult;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FiindInCompileResultsTests {

  @Test
  public void unitChanged_functionAdded() {
    Pack pack = new Pack();

    final String classHelloWorldOld =
        "package dev.codehistory;\r\n" +
            "  class HelloWorld {" +
            "  }";

    final String classHelloWorldNew =
        "package dev.codehistory;\r\n" +
            "  class HelloWorld {" +
            "    public void foo() { }" +
            "  }";

    Diff diff = new DiffString(new DiffKey(SourceType.JAVA, "HelloWorld"), classHelloWorldNew, classHelloWorldOld);
    pack.getDiffs().add(diff);

    ChangesCompiler compiler = new ChangesCompiler();
    List<CompileResult> results = compiler.compileDiff(pack);

    CompileResult helloWordClassChange = results.get(0);
    List<ModuleUnitChange> classChanges = helloWordClassChange.findUnitChanges("dev.codehistory", "HelloWorld");

    Assert.assertEquals(1,  classChanges.size());
    Assert.assertEquals(ModuleUnitChangeType.CHANGED,  classChanges.get(0).getChangeType());
  }
}
