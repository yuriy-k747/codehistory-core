package dev.codehistory.core.commands;

import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.entities.sources.SourceChange;
import dev.codehistory.core.index.sources.data.SourceIndexData;
import dev.codehistory.core.util.external.GitFilesHistoryResult;

import java.util.*;
import java.util.stream.Collectors;

public class FilesHistoryResult {
  private final SourceIndexData data;
  private final Map<String, Set<String>> rootPaths = new HashMap<>();
  private final Map<String, List<ModuleUnitMemberChange>> memberChanges;
  private final Map<String, List<ModuleUnitChange>> unitChanges;
  
  public FilesHistoryResult(SourceIndexData data, GitFilesHistoryResult filesHistoryResult) {
    this.data = data;
    
    filesHistoryResult.getFilesHistory().forEach((s, gitFilesHistory) -> {
        this.rootPaths.computeIfAbsent(s, s1 -> new HashSet<>());
        this.rootPaths.get(s).addAll(gitFilesHistory.getRenames());
    });
    
    this.memberChanges = mapToPath(data.getModuleUnitMemberChanges().values());
    this.unitChanges = mapToPath(data.getModuleUnitChanges().values());
  }
  
  public Map<String, List<ModuleUnitMemberChange>> getMemberChanges() {
    return memberChanges;
  }
  
  public Map<String, List<ModuleUnitChange>> getUnitChanges() {
    return unitChanges;
  }
  
  private <T extends SourceChange> Map<String, List<T>> mapToPath(Collection<T> sourceChanges) {
    Map<String, List<T>> mapped = new HashMap<>();
    
    for (T sourceChange : sourceChanges) {
      String path = sourceChange.getFile().getPath();
      List<T> changes = mapped.computeIfAbsent(path, k -> new ArrayList<>());
      changes.add(sourceChange);
    }
  
    Map<String, List<T>> grouped = groupPaths(mapped);
    sort(grouped);
    
    return grouped;
  }
  
  private <T extends SourceChange> Map<String, List<T>> groupPaths(Map<String, List<T>> mapped) {
    Map<String, List<T>> res = new HashMap<>();
  
    rootPaths.forEach((s, ts) -> {
      for (String t : ts) {
        if(mapped.containsKey(t)) {
          List<T> changes = res.computeIfAbsent(s, k -> new ArrayList<>());
          changes.addAll(mapped.get(t));
        }
      }
    });
    
    return res;
  }
  
  private <T extends SourceChange> void sort(Map<String, List<T>> mapped) {
    mapped.forEach((s, ts) -> {
      List<T> sorted = ts.stream().sorted((o1, o2) -> o2.getCommit().getCreated().compareTo(o1.getCommit().getCreated())).collect(Collectors.toList());
      mapped.put(s, sorted);
    });
  }
  
  public Map<String, Set<String>> getRootPaths() {
    return rootPaths;
  }
}
