package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.entities.git.GitAuthor;

import java.util.*;

public class ModuleUnit extends SourcePart {
  public static final String Keyword = "keyword";
  private Realm realm;
  private String keyword;
  private List<ModuleUnitMember> moduleUnitMembers = new ArrayList<>();
  private Long moduleId;
  private Module module;
  private Map<Long, GitAuthor> authors = new HashMap<>();
  private List<GitAuthor> authorsAsList = new ArrayList<>();
  private List<Commit> commits = new ArrayList<>();
  private List<ModuleUnitDefinition> definitions = new ArrayList<>();
  private ChangeStats membersChangeStats;
  private ModuleUnitDefinition lastDefinition;

  public ModuleUnitDefinition getLastDefinition() {
    return lastDefinition;
  }
  
  public void trimDefinitions() {
    if(definitions.isEmpty()) {
      lastDefinition = definitions.get(0);
    }
    
    ArrayList<ModuleUnitDefinition> res = new ArrayList<>();
    HashSet<String> defs = new HashSet<>();
  
    for (int i = definitions.size() - 1; i >= 0; i--) {
      ModuleUnitDefinition definition = definitions.get(i);
      String def = definition.getValue();
      if (!defs.contains(def)) {
        defs.add(def);
        res.add(definition);
      }
    }
    
    definitions = res;
    Collections.reverse(definitions);
  }
  
  public int getCommitsNumber() {
    Set<Long> res = new HashSet<>();
    
    for (GitAuthor author : authorsAsList) {
      res.addAll(author.getCommitsIds());
    }
    
    return res.size();
  }
  
  public Realm getRealm() {
    return realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
  }
  
  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getModule().hashCode();
    result = 23 * result + getRealm().hashCode();
    result = 23 * result + getKeyword().hashCode();
    result = 23 * result + getSanitizedIdentifier().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof ModuleUnit)) {
      return false;
    }

    ModuleUnit wrapper = (ModuleUnit) obj;
    return wrapper.getRealm().equals(getRealm())
        && wrapper.getKeyword().equals(getKeyword())
        && wrapper.getSanitizedIdentifier().equals(getSanitizedIdentifier());
  }

  public List<ModuleUnitMember> getModuleUnitMembers() {
    return moduleUnitMembers;
  }

  public void setModuleUnitMembers(List<ModuleUnitMember> moduleUnitMembers) {
    this.moduleUnitMembers = moduleUnitMembers;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s", getRealm(), getKeyword(), getIdentifier());
  }

  public Long getModuleId() {
    return moduleId;
  }

  public void setModuleId(Long moduleId) {
    this.moduleId = moduleId;
  }

  public Module getModule() {
    return module;
  }

  public void setModule(Module module) {
    this.module = module;
  }
  
  public ChangeStats getMembersChangeStats() {
    return membersChangeStats;
  }
  
  public void setMembersChangeStats(ChangeStats membersChangeStats) {
    this.membersChangeStats = membersChangeStats;
  }
  
  public Map<Long, GitAuthor> getAuthors() {
    return authors;
  }
  
  public void setAuthors(Map<Long, GitAuthor> val) {
    authors = val;
  }
  
  public List<GitAuthor> getAuthorsAsList() {
    return authorsAsList;
  }
  
  public void setAuthorsAsList(List<GitAuthor> authorsAsList) {
    this.authorsAsList = authorsAsList;
  }
  
  public List<Commit> getCommits() {
    return commits;
  }
  
  public void setCommits(List<Commit> commits) {
    this.commits = commits;
  }
  
  public List<ModuleUnitDefinition> getDefinitions() {
    return definitions;
  }
  
  public void setDefinitions(List<ModuleUnitDefinition> definitions) {
    this.definitions = definitions;
  }
}
