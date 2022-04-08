package dev.codehistory.core.index.sources;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.entities.sources.ModuleUnit;
import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.index.sources.parsers.errors.CodeHistoryError;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompileResult {
  public static final CompileResult Empty = new CompileResult(null, null, null, null);

  private final List<ModuleUnitChange> moduleUnitChanges;
  private final List<ModuleUnitMemberChange> moduleUnitMemberChanges;
  private final List<CodeHistoryError> oldCriticalErrors;
  private final List<CodeHistoryError> newCriticalErrors;
  private String filePath;

  public CompileResult(
      List<ModuleUnitChange> moduleUnitChanges,
      List<ModuleUnitMemberChange> moduleUnitMemberChanges,
      List<CodeHistoryError> oldCriticalErrors,
      List<CodeHistoryError> newCriticalErrors) {
    this.moduleUnitChanges = moduleUnitChanges;
    this.moduleUnitMemberChanges = moduleUnitMemberChanges;
    this.oldCriticalErrors = oldCriticalErrors;
    this.newCriticalErrors = newCriticalErrors;
  }

  public List<ModuleUnitChange> findUnitChanges(String module, String unit) {
    var res = moduleUnitChanges.stream().filter(moduleUnitMemberChange -> {
      ModuleUnit moduleUnit = moduleUnitMemberChange.getModuleUnit();
      if(!moduleUnit.getIdentifier().equals(unit)) {
        return false;
      }

      return moduleUnit.getModule().getName().equals(module);
    });

    return res.collect(Collectors.toList());
  }

  public List<ModuleUnitMemberChange> findMemberChanges(String module, String unit) {
    Stream<ModuleUnitMemberChange> res = moduleUnitMemberChanges.stream().filter(moduleUnitMemberChange -> {
      ModuleUnit moduleUnit = moduleUnitMemberChange.getModuleUnitMember().getModuleUnit();
      if(!moduleUnit.getIdentifier().equals(unit)) {
        return false;
      }

      return moduleUnit.getModule().getName().equals(module);
    });

    return res.collect(Collectors.toList());
  }

  public List<ModuleUnitMemberChange> findMemberChanges(String module, String unit, String member) {
    List<ModuleUnitMemberChange> unitMembersChanged = findMemberChanges(module, unit);

    return unitMembersChanged.stream()
        .filter(moduleUnitMemberChange -> moduleUnitMemberChange.getModuleUnitMember().getIdentifier().equals(member))
        .collect(Collectors.toList());
  }

  public List<ModuleUnitChange> getModuleUnitChanges() {
    return moduleUnitChanges;
  }

  public List<ModuleUnitMemberChange> getModuleUnitMemberChanges() {
    return moduleUnitMemberChanges;
  }

  public List<CodeHistoryError> getOldCriticalErrors() {
    return oldCriticalErrors;
  }

  public List<CodeHistoryError> getNewCriticalErrors() {
    return newCriticalErrors;
  }

  public boolean isFaulted() {
    return !oldCriticalErrors.isEmpty() || !newCriticalErrors.isEmpty();
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  
  public void setCommits(Commit commit, Commit commitParent) {
    for (ModuleUnitChange unitChange : getModuleUnitChanges()) {
      unitChange.setCommitId(commit.getId());
      unitChange.setCommit(commit);
      if (commitParent != null) {
        unitChange.setCommitParent(commitParent);
      }
    }
  
    for (ModuleUnitMemberChange memberChange : getModuleUnitMemberChanges()) {
      memberChange.setCommit(commit);
      if (commitParent != null) {
        memberChange.setCommitParent(commitParent);
      }
    }
  }
  
  @Override
  public String toString() {
    return String.format("moduleUnitChanges=%d, moduleUnitMemberChanges=%d, oldCriticalErrors=%d, newCriticalErrors=%d, filePath='%s'", moduleUnitChanges.size(), moduleUnitMemberChanges.size(), oldCriticalErrors.size(), newCriticalErrors.size(), filePath);
  }
}
