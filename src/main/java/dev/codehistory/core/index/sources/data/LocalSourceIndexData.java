package dev.codehistory.core.index.sources.data;

import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.entities.sources.Module;
import dev.codehistory.core.index.IndexData;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalSourceIndexData extends IndexData {
  protected final ConcurrentHashMap<Module, Module> modules = new ConcurrentHashMap<>();
  protected final ConcurrentHashMap<ModuleUnit, ModuleUnit> moduleUnits = new ConcurrentHashMap<>();
  protected final ConcurrentHashMap<ModuleUnitChange, ModuleUnitChange> moduleUnitChanges = new ConcurrentHashMap<>();
  protected final ConcurrentHashMap<ModuleUnitMember, ModuleUnitMember> moduleUnitMembers = new ConcurrentHashMap<>();
  protected final ConcurrentHashMap<ModuleUnitMemberChange, ModuleUnitMemberChange> moduleUnitMemberChanges = new ConcurrentHashMap<>();

  public Module put(Module module) {
    return put(modules, module);
  }

  public ModuleUnit put(ModuleUnit moduleUnit) {
    return put(moduleUnits, moduleUnit);
  }

  public ModuleUnitChange put(ModuleUnitChange moduleUnit) {
    return put(moduleUnitChanges, moduleUnit);
  }

  public ModuleUnitMember put(ModuleUnitMember moduleUnitMember) {
    return put(moduleUnitMembers, moduleUnitMember);
  }

  public ModuleUnitMemberChange put(ModuleUnitMemberChange moduleUnitMember) {
    return put(moduleUnitMemberChanges, moduleUnitMember);
  }

  public Map<ModuleUnit, ModuleUnit> getModuleUnits() {
    return new HashMap<>(moduleUnits);
  }

  public Map<ModuleUnitMember, ModuleUnitMember> getModuleUnitMembers() {
    return new HashMap<>(moduleUnitMembers);
  }

  public Map<ModuleUnitMemberChange, ModuleUnitMemberChange> getModuleUnitMemberChanges() {
    return new HashMap<>(moduleUnitMemberChanges);
  }
  
  public Map<ModuleUnitChange, ModuleUnitChange> getModuleUnitChanges() {
    return new HashMap<>(moduleUnitChanges);
  }
}
