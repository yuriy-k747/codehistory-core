package dev.codehistory.core.entities.sources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ModuleUnitMember extends SourcePart {
  public static final String Field = "field";
  public static final String Constructor = "constructor";
  public static final String Property = "property";
  public static final String Method = "method";
  public static final String Indexer = "indexer";
  public static final String Operator = "operator";
  public static final String Event = "event";
  public static final String StaticBlock = "static block";
  
  private Long moduleUnitId;
  private ModuleUnit moduleUnit;
  private String category;
  private String distinguisher;
  private List<ModuleUnitMemberDefinition> definitions = new ArrayList<>();
  private ModuleUnitMemberDefinition lastDefinition;
  
  public ModuleUnitMemberDefinition getLastDefinition() {
    return lastDefinition;
  }
  
  public void trimDefinitions() {
    if(definitions.isEmpty()) {
      lastDefinition = definitions.get(0);
    }
    
    ArrayList<ModuleUnitMemberDefinition> res = new ArrayList<>();
    HashSet<String> defs = new HashSet<>();
    
    for (int i = definitions.size() - 1; i >= 0; i--) {
      ModuleUnitMemberDefinition definition = definitions.get(i);
      String def = definition.getValue();
      if (!defs.contains(def)) {
        defs.add(def);
        res.add(definition);
      }
    }
    
    definitions = res;
    Collections.reverse(definitions);
  }
  
  public String getFullIdentifier() {
    if(getDistinguisher().equals("")) {
      return getIdentifier();
    } else {
      return String.format("%s %s", getIdentifier(), getDistinguisher());
    }
  }
  
  public Long getModuleUnitId() {
    return moduleUnitId;
  }

  public void setModuleUnitId(Long moduleUnitId) {
    this.moduleUnitId = moduleUnitId;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getModuleUnit().hashCode();
    result = 23 * result + getCategory().hashCode();
    result = 23 * result + getSanitizedIdentifier().hashCode();
    result = 23 * result + getDistinguisher().hashCode();
    
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof ModuleUnitMember)) {
      return false;
    }

    ModuleUnitMember wrapper = (ModuleUnitMember) obj;
    
    return wrapper.getModuleUnit().equals(getModuleUnit())
        && equalsByOwnProps(wrapper);
  }

  public boolean equalsByOwnProps(ModuleUnitMember wrapper) {
    return wrapper.getCategory().equals(getCategory())
        && wrapper.getSanitizedIdentifier().equals(getSanitizedIdentifier())
        && wrapper.getDistinguisher().equals(getDistinguisher());
  }
  
  public ModuleUnit getModuleUnit() {
    return moduleUnit;
  }

  public void setModuleUnit(ModuleUnit moduleUnit) {
    this.moduleUnit = moduleUnit;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return String.format("%s %s", getCategory(), getFullIdentifier());
  }
  
  public String getDistinguisher() {
    return distinguisher;
  }
  
  public void setDistinguisher(String distinguisher) {
    this.distinguisher = distinguisher;
  }
  
  public List<ModuleUnitMemberDefinition> getDefinitions() {
    return definitions;
  }
  
  public void setDefinitions(List<ModuleUnitMemberDefinition> definitions) {
    this.definitions = definitions;
  }
}
