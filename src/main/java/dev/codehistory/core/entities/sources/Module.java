package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.entities.git.GitAuthor;
import dev.codehistory.core.util.CommonUtil;

import java.io.Serializable;
import java.util.*;

public class Module extends IdEntity {
  private ModuleType moduleType;
  private String prefix;
  private String name;
  private List<ModuleUnit> moduleUnits = new ArrayList<>();
  private Map<Long, ModuleUnit> moduleUnitsMap;
  
  // commitsNumber
  public int getCommitsNumber() {
    Set<Long> res = new HashSet<>();
  
    for (ModuleUnit unit : moduleUnits) {
      for (GitAuthor author : unit.getAuthorsAsList()) {
        res.addAll(author.getCommitsIds());
      }
    }
    
    return res.size();
  }
  
  public List<GitAuthor> getAuthorsAsList() {
    Set<GitAuthor> set = new HashSet<>();
  
    for (ModuleUnit unit : moduleUnits) {
        set.addAll(unit.getAuthorsAsList());
    }
  
    return new ArrayList<>(set);
  }
  
  // authorsNumber
  public int getAuthorsNumber() {
    int res = 0;
    Set<Long> authorsIds = new HashSet<>();
  
    for (ModuleUnit unit : moduleUnits) {
      for (GitAuthor author : unit.getAuthorsAsList()) {
        if(!authorsIds.contains(author.getId())) {
          res += 1;
          authorsIds.add(author.getId());
        }
      }
    }
  
    return res;
  }
  
  public ModuleType getModuleType() {
    return moduleType;
  }

  public void setModuleType(ModuleType moduleType) {
    this.moduleType = moduleType;
  }

  public String getName() {
    return name;
  }

  public String getShortName() {
    return getShortName('.');
  }

  public String getShortName(char c) {
    return name.substring(name.lastIndexOf(c) + 1).trim();
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getName().hashCode();
    result = 23 * result + getModuleType().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Module)) {
      return false;
    }

    Module wrapper = (Module) obj;
    return wrapper.getName().equals(getName())
        && wrapper.getModuleType().equals(getModuleType());
  }

  public List<ModuleUnit> getModuleUnits() {
    return moduleUnits;
  }

  public void setModuleUnits(List<ModuleUnit> moduleUnits) {
    this.moduleUnits = moduleUnits;
  }

  public void initModuleUnitsMap() {
    moduleUnitsMap = CommonUtil.toHashMap(moduleUnits);
  }
  
  @Override
  public String toString() {
    return getName();
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  
  public Map<Long, ModuleUnit> getModuleUnitsMap() {
    return moduleUnitsMap;
  }
}
