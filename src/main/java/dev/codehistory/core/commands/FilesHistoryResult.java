package dev.codehistory.core.commands;

import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.entities.sources.SourceChange;
import dev.codehistory.core.index.sources.data.SourceIndexData;

import java.util.*;
import java.util.stream.Collectors;

public class FilesHistoryResult {
  private final SourceIndexData data;
  Map<String, Set<String>> filePathsWithRenames;
  private final Map<String, List<ModuleUnitMemberChange>> pathMemberChanges;
  private final Map<String, List<ModuleUnitChange>> pathUnitChanges;
  
  public FilesHistoryResult(SourceIndexData data, Map<String, Set<String>> rootPaths) {
    this.data = data;
    this.filePathsWithRenames = rootPaths;
    this.pathMemberChanges = mapToPath(data.getModuleUnitMemberChanges().values());
    this.pathUnitChanges = mapToPath(data.getModuleUnitChanges().values());
  }
  
  public Map<String, List<ModuleUnitMemberChange>> getPathMemberChanges() {
    return pathMemberChanges;
  }
  
  public Map<String, List<ModuleUnitChange>> getPathUnitChanges() {
    return pathUnitChanges;
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
    Map<String, List<T>> res = new HashMap<>(filePathsWithRenames.keySet().size());
  
    filePathsWithRenames.forEach((s, ts) -> {
      for (String t : ts) {
        if(mapped.containsKey(t)) {
          res.put(s, mapped.get(t));
        }
      }
    });
    
    return res;
  }
  
  private <T extends SourceChange> void sort(Map<String, List<T>> mapped) {
    mapped.forEach((s, ts) -> {
      mapped.put(s, ts.stream().sorted((o1, o2) -> o2.getCommit().getCreated().compareTo(o1.getCommit().getCreated())).collect(Collectors.toList()));
    });
  }
  
  public Map<String, Set<String>> getFilePathsWithRenames() {
    return filePathsWithRenames;
  }
}
