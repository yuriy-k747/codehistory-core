package dev.codehistory.core.views.commit;

import dev.codehistory.core.entities.sources.ModuleUnitMember;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.util.SourcesUtil;

public class CommitViewModuleUnitMember {
  private final ModuleUnitMember moduleUnitMember;
  private final ModuleUnitMemberChange moduleUnitMemberChange;

  public CommitViewModuleUnitMember(ModuleUnitMember moduleUnitMember, ModuleUnitMemberChange moduleUnitMemberChange) {
    this.moduleUnitMember = moduleUnitMember;
    this.moduleUnitMemberChange = moduleUnitMemberChange;
  }

  public ModuleUnitMember getMember() {
    return moduleUnitMember;
  }

  public ModuleUnitMemberChange getMemberChange() {
    return moduleUnitMemberChange;
  }

  public String getTitleInfo() {
    return String.format("[%s] %s %s",
        moduleUnitMemberChange.getChangeType().name(), moduleUnitMember.getCategory(), moduleUnitMember.getIdentifier());
  }

  public String getId() {
    return String.format("%d", moduleUnitMember.getId());
  }

  public String getChangeId() {
    return String.format("%d", moduleUnitMemberChange.getId());
  }

  // changeType
  public String getChangeType() {
    return moduleUnitMemberChange.getChangeType().name();
  }

  public String getCategory() {
    return moduleUnitMember.getCategory();
  }

  public String getDefinition() {
    return SourcesUtil.getMemberDefinition(moduleUnitMember, moduleUnitMemberChange);
  }
}
