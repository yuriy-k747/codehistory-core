package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.util.SourcesUtil;

public class ModuleUnitDefinition {
  private final ModuleUnit unit;
  private final ModuleUnitChange change;
  private final Commit commit;
  
  public ModuleUnitDefinition(ModuleUnit unit, ModuleUnitChange change, Commit commit) {
    this.unit = unit;
    this.change = change;
    this.commit = commit;
  }
  
  public ModuleUnit getUnit() {
    return unit;
  }
  
  public ModuleUnitChange getChange() {
    return change;
  }
  
  public Commit getCommit() {
    return commit;
  }
  
  public String getValue() {
    return SourcesUtil.getUnitDefinitionHtml(unit, change, null);
  }
  
  public String getValueCutDef(Integer maxDefSize) {
    return SourcesUtil.getUnitDefinitionHtml(unit, change, maxDefSize);
  }
  
  // valueLinked
  public String getValueLinked(String Urls_SourceCard_Unit) {
    return SourcesUtil.getUnitDefinitionHtmlLinked(unit, change, null, null, Urls_SourceCard_Unit);
  }
  
  // valueLinkedCutDef
  public String getValueLinkedCutDef(Integer maxDefSize, String Urls_SourceCard_Unit) {
    return getValueLinkedCutDef(maxDefSize, null, Urls_SourceCard_Unit);
  }
  
  public String getValueLinkedCutDef(Integer maxDefSize, Long branchId, String Urls_SourceCard_Unit) {
    return SourcesUtil.getUnitDefinitionHtmlLinked(unit, change, maxDefSize, branchId, Urls_SourceCard_Unit);
  }
  
  @Override
  public String toString() {
    return getValue();
  }
}
