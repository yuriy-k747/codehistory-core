package dev.codehistory.core.parsing;

import dev.codehistory.core.entities.diff.SourceType;
import dev.codehistory.core.entities.sources.ModuleUnit;
import dev.codehistory.core.entities.sources.ModuleUnitMember;
import dev.codehistory.core.entities.sources.SourcePart;
import dev.codehistory.core.index.sources.SourceFileDiffCompiler;
import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.parsers.Parser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;

public class CsharpParseTests extends SourceTestsBase {

  @Test
  public void testClassParse() throws IOException {
    String path = "csharp/TestClass.v1.cs";
    Parser parser = SourceFileDiffCompiler.createParser(SourceType.CSHARP, path);
    try (InputStream stream = loadFileStream(path)) {
      parser.parse(stream);
    }

    LocalSourceIndexData data = parser.getData();

    Assertions.assertEquals(1, data.getModuleUnits().size());
  
    Optional<ModuleUnit> unitOptional = data.getModuleUnits().keySet().stream().findFirst();
    Assertions.assertTrue(unitOptional.isPresent());
    
    ModuleUnit moduleUnit = unitOptional.get();
    Assertions.assertEquals("TestClass", moduleUnit.getIdentifier());
  }

  @Test
  public void de4dot_AssemblyResolver_ClearAllShouldNotBeAdded() throws IOException {
    String pathNew = "csharp/de4dot/AssemblyResolver_new.cs";
    Parser parserNew = SourceFileDiffCompiler.createParser(SourceType.CSHARP, pathNew);
    try (InputStream stream = loadFileStream(pathNew)) {
      parserNew.parse(stream);
    }

    String pathOld = "csharp/de4dot/AssemblyResolver_old.cs";
    Parser parserOld = SourceFileDiffCompiler.createParser(SourceType.CSHARP, pathOld);
    try (InputStream stream = loadFileStream(pathOld)) {
      parserOld.parse(stream);
    }

    LocalSourceIndexData newData = parserNew.getData();
    LocalSourceIndexData oldData = parserOld.getData();

    Assertions.assertEquals(10, newData.getModuleUnitMembers().size());
    Assertions.assertEquals(6, oldData.getModuleUnitMembers().size());

    ModuleUnitMember clearAllNew = getModuleUnitMember(newData, "ClearAll()");
    ModuleUnitMember clearAllOld = getModuleUnitMember(oldData, "ClearAll()");

    Assertions.assertEquals(clearAllNew.getSourceState().getSha1(), clearAllOld.getSourceState().getSha1());
  }

  @Test
  public void de4dot_Renamer_8d5dae6d_enumParsed() throws IOException {
    String path = "csharp/de4dot/Renamer_8d5dae6d.cs";
    Parser parser = SourceFileDiffCompiler.createParser(SourceType.CSHARP, path);
    try (InputStream stream = loadFileStream(path)) {
      parser.parse(stream);
    }

    LocalSourceIndexData data = parser.getData();

    ModuleUnit propertyMethodType = getModuleUnit(data, "Renamer.PropertyMethodType");
    ModuleUnit mergeStateFlags = getModuleUnit(data, "Renamer.MergeStateFlags");

    Assertions.assertEquals(3, propertyMethodType.getModuleUnitMembers().size());
    Assertions.assertEquals(4, mergeStateFlags.getModuleUnitMembers().size());
  }
  
  private ModuleUnitMember getModuleUnitMember(LocalSourceIndexData data, String identifier) {
    return get(data.getModuleUnitMembers().keySet(), identifier);
  }

  private ModuleUnit getModuleUnit(LocalSourceIndexData data, String identifier) {
    return get(data.getModuleUnits().keySet(), identifier);
  }

  private <T extends SourcePart> T get(Set<T> data, String identifier) {
    return data.stream()
        .filter(m -> m.getIdentifier().equals(identifier))
        .findFirst()
        .get();
  }
}

