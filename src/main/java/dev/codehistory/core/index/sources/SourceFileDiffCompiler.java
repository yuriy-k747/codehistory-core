package dev.codehistory.core.index.sources;

import dev.codehistory.core.entities.diff.SourceType;
import dev.codehistory.core.entities.sources.Module;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.parsers.CsharpParser;
import dev.codehistory.core.index.sources.parsers.JavaParserMain;
import dev.codehistory.core.index.sources.parsers.Parser;
import dev.codehistory.core.index.sources.parsers.errors.CodeHistoryError;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SourceFileDiffCompiler {
  private final String newPath;
  private final String oldPath;

  public SourceFileDiffCompiler(String newPath, String oldPath) {
    this.newPath = newPath;
    this.oldPath = oldPath;
  }

  public CompileResult compile(SourceType type, InputStream newStream, InputStream oldStream) throws IOException {
    return compile(type, newPath, oldPath, newStream, oldStream);
  }

  private CompileResult compile(
      SourceType type,
      String newPath,
      String oldPath,
      InputStream newStream,
      InputStream oldStream) throws IOException {

    Parser newParser = null;
    Parser oldParser = null;

    // use stream null checks, because oldPath in this case "/dev/null"
    if (newStream != null) {
      newParser = createParser(type, newPath);
      newParser.parse(newStream);
      newParser.compileCriticalErrors();
    } else {
      newParser = createParser(type, oldPath); // create, but not parse - same realm, all deleted
    }

    if (oldStream != null) {
      oldParser = createParser(type, oldPath);
      oldParser.parse(oldStream);
      oldParser.compileCriticalErrors();
    } else {
      oldParser = createParser(type, newPath); // create, but not parse - same realm, all added
    }

    return compile(newParser, oldParser);
  }

  private static CompileResult compile(Parser newParser, Parser oldParser) {
    List<CodeHistoryError> oldCriticalErrors = oldParser.getCriticalErrors();
    List<CodeHistoryError> newCriticalErrors = newParser.getCriticalErrors();

    if (oldCriticalErrors.isEmpty() && newCriticalErrors.isEmpty()) {
      ChangesCoreCompiler compilator = new ChangesCoreCompiler(newParser, oldParser);
      compilator.compile();

      List<ModuleUnitChange> unitChanges = compilator.getUnitChanges();
      List<ModuleUnitMemberChange> memberChanges = compilator.getMemberChanges();
  
      CompileResult res = new CompileResult(unitChanges, memberChanges, oldCriticalErrors, newCriticalErrors);
      detectMoves(res);
      return res;

    } else {
      return new CompileResult(null, null, oldCriticalErrors, newCriticalErrors);
    }
  }

  private static void detectMoves(CompileResult res) {
    List<ModuleUnitMemberChange> memberChanges = res.getModuleUnitMemberChanges();
    detectChanges(res.getModuleUnitChanges(), memberChanges);
  }

  private static void detectChanges(
      List<ModuleUnitChange> moduleUnitChanges,
      List<ModuleUnitMemberChange> memberChanges) {
    List<ModuleUnitChange> added = getByChangeType(moduleUnitChanges, ModuleUnitChangeType.ADDED);
    List<ModuleUnitChange> deleted = getByChangeType(moduleUnitChanges, ModuleUnitChangeType.DELETED);

    Map<ModuleUnit, ModuleUnitChange> deletedModuleUnits = deleted
        .stream()
        .collect(Collectors.toMap(ModuleUnitChange::getModuleUnit, c -> c));

    for (ModuleUnitChange itemAddedChange : added) {
      ModuleUnit itemDeleted = findBySha1(deletedModuleUnits.keySet(), itemAddedChange.getModuleUnit());
      if (itemDeleted != null) {
        ModuleUnitChange itemDeletedChange = deletedModuleUnits.get(itemDeleted);

        itemDeletedChange.setChangeType(ModuleUnitChangeType.MOVED_TO);
        itemDeletedChange.setMovedTo(itemAddedChange.getModuleUnit().getModule());
        itemDeletedChange.setOrigin(itemAddedChange.getModuleUnit());

        itemAddedChange.setChangeType(ModuleUnitChangeType.MOVED_FROM);
        itemAddedChange.setMovedFrom(itemDeleted.getModule());
        itemAddedChange.setOrigin(itemDeleted);

        for(ModuleUnitMemberChange memberChange : memberChanges) {
          if(memberChange.getChangeType() != ModuleUnitMemberChangeType.DELETED
            && memberChange.getChangeType() != ModuleUnitMemberChangeType.ADDED) {
            continue;
          }

          ModuleUnit moduleUnit = memberChange.getModuleUnitMember().getModuleUnit();
          Module fromModule = itemDeletedChange.getModuleUnit().getModule();
          Module toModule = itemAddedChange.getModuleUnit().getModule();

          if(moduleUnit.equals(itemDeletedChange.getModuleUnit()) && moduleUnit.getModule().equals(fromModule)) {
            memberChange.setChangeType(ModuleUnitMemberChangeType.MOVED_TO);
            memberChange.setMovedTo(itemAddedChange.getModuleUnit());
            memberChange.setOrigin(findOrigin(itemAddedChange.getModuleUnit(), memberChange.getModuleUnitMember()));
          } else if(moduleUnit.equals(itemAddedChange.getModuleUnit()) && moduleUnit.getModule().equals(toModule)) {
            memberChange.setChangeType(ModuleUnitMemberChangeType.MOVED_FROM);
            memberChange.setMovedFrom(itemDeletedChange.getModuleUnit());
            memberChange.setOrigin(findOrigin(itemAddedChange.getModuleUnit(), memberChange.getModuleUnitMember()));
          }
        }
      }
    }
  }
  
  public static ModuleUnitMember findOrigin(ModuleUnit unitOrigin, ModuleUnitMember currentMember) {
    for (ModuleUnitMember member : unitOrigin.getModuleUnitMembers()) {
      if(member.equalsByOwnProps(currentMember)) {
        return member;
      }
    }
    
    throw new IllegalStateException();
  }

  private static <T extends SourcePart> T findBySha1(Collection<T> coll, T state) {
    var item = coll.stream()
        .filter(c -> c.getSourceState().getSha1().equals(state.getSourceState().getSha1()))
        .collect(Collectors.toList());

    if (item.size() > 1) {
      throw new IllegalStateException();
    }

    return item.isEmpty() ? null : item.get(0);
  }

  private static List<ModuleUnitChange> getByChangeType(List<ModuleUnitChange> moduleUnitChanges, ModuleUnitChangeType type) {
    return moduleUnitChanges.stream()
        .filter(c -> c.getChangeType().equals(type))
        .collect(Collectors.toList());
  }

  public static Parser createParser(SourceType type, String path) {
    LocalSourceIndexData localCommitData = new LocalSourceIndexData();

    switch (type) {
      case CSHARP:
        return new CsharpParser(path, localCommitData);
      case JAVA:
        return new JavaParserMain(path, localCommitData);
      case NOT_SUPPORTED:
        throw new IllegalStateException(String.format("Source type is not supported for path: \"%s\"", path));
      default:
        throw new IllegalStateException(String.format("Unknown source type for path: \"%s\"", path));
    }
  }
}
