package dev.codehistory.core.parsing;

import dev.codehistory.core.entities.diff.SourceType;
import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChangeType;
import dev.codehistory.core.index.sources.CompileResult;
import dev.codehistory.core.index.sources.SourceFileDiffCompiler;
import dev.codehistory.core.util.SourcesUtil;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class CsharpDiffsSourceTests extends SourceTestsBase {

  @Test
  public void sameFiles_noChanges() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,"csharp/TestClass.v1.cs", "csharp/TestClass.v1.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertTrue("unitChanges should be empty", unitChanges.isEmpty());
    Assert.assertTrue("memberChanges should be empty", memberChanges.isEmpty());
  }

  @Test
  public void added_basicMembers() throws IOException {
    var pair = compileChanges(SourceType.CSHARP, "csharp/TestClass.v1.cs", "csharp/TestClass.v2.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertEquals(1, unitChanges.size());
    Assert.assertEquals(15, memberChanges.size());

    List<ModuleUnitMemberChange> stringConsts = memberChanges.stream()
        .filter(c -> c.getSourceState().getDefinition().contains("const string"))
        .collect(Collectors.toList());

    Assert.assertEquals(4, stringConsts.size());
  }

  @Test
  public void deleted_vasicMembers() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,"csharp/TestClass.v2.cs", "csharp/TestClass.v3.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertEquals(1, unitChanges.size()); // unit changed because it's members were changed
    Assert.assertEquals(3, memberChanges.size());
    for (ModuleUnitMemberChange change : memberChanges) {
      Assert.assertEquals(ModuleUnitMemberChangeType.DELETED, change.getChangeType());
    }
  }

  @Test
  public void changed_ClassOnlyDefinition() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,"csharp/TestClass.v4.cs", "csharp/TestClass.v5.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertEquals(1, unitChanges.size());
    Assert.assertEquals(0, memberChanges.size());

    ModuleUnitChange TestClass_change = SourcesUtil.firstUnit(unitChanges, "TestClass");
  }

  @Test
  public void constructorDefinition_EndlineInTheMiddle() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,
        "csharp/constructorDefinitionEndlineInTheMiddle2_old.cs", "csharp/constructorDefinitionEndlineInTheMiddle2_new.cs"
    );

    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertEquals(0, unitChanges.size());
    Assert.assertEquals(0, memberChanges.size());
  }

  @Test
  public void moduleUnitChanged_withoutMembers_aka_Semanticless() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,"csharp/TestClass.v6.cs", "csharp/TestClass.v7.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();
  }

  @Test
  public void changed_fileNameOnly() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,"csharp/moves/Enity_file2.cs", "csharp/moves/Enity_file1.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertEquals(0, unitChanges.size());
    Assert.assertEquals(0, memberChanges.size());
  }

  @Test
  public void moved_moduleUnit_toOtherModule() throws IOException {
    var pair = compileChanges(SourceType.CSHARP,"csharp/moves/Enity_module1.cs", "csharp/moves/Enity_module2.cs");
    List<ModuleUnitChange> unitChanges = pair.getLeft();
    List<ModuleUnitMemberChange> memberChanges = pair.getRight();

    Assert.assertEquals(2, unitChanges.size());
    Assert.assertEquals(2, memberChanges.size());
  }

  @Test
  public void deleted_class() throws IOException {
    try (InputStream oldStream = loadFileStream("csharp/moves/Enity_file1.cs")) {
      SourceFileDiffCompiler compilatorOfFileChange = new SourceFileDiffCompiler("", "csharp/moves/Enity_file1.cs");
      CompileResult res = compilatorOfFileChange.compile(SourceType.CSHARP, null, oldStream);

      var pair = Pair.of(res.getModuleUnitChanges(), res.getModuleUnitMemberChanges());
      List<ModuleUnitChange> unitChanges = pair.getLeft();
      Assert.assertEquals(1, unitChanges.size());
    }
  }
}