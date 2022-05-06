package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.git.File;

public class ModuleUnitMemberChange extends SourceChange {
  private Long moduleUnitMemberId;
  private ModuleUnitMember moduleUnitMember;
  private ModuleUnitMemberChangeType moduleUnitMemberChangeType;
  private ModuleUnitChange correspondingModuleUnitChange;
  private Long movedToId;
  private ModuleUnit movedTo;
  private Long movedFromId;
  private ModuleUnit movedFrom;
  private Long fileId;
  private Long originId;
  private ModuleUnitMember origin;

  public Long getModuleUnitMemberId() {
    return moduleUnitMemberId;
  }

  public void setModuleUnitMemberId(Long moduleUnitMemberId) {
    this.moduleUnitMemberId = moduleUnitMemberId;
  }

  public ModuleUnitMember getModuleUnitMember() {
    return moduleUnitMember;
  }

  public void setModuleUnitMember(ModuleUnitMember moduleUnitMember) {
    this.moduleUnitMember = moduleUnitMember;
  }

  public ModuleUnitMemberChangeType getChangeType() {
    return moduleUnitMemberChangeType;
  }

  public void setChangeType(ModuleUnitMemberChangeType moduleUnitMemberChangeType) {
    this.moduleUnitMemberChangeType = moduleUnitMemberChangeType;
  }

  @Override
  public String toString() {
    if(getChangeType() == ModuleUnitMemberChangeType.DELETED) {
      return ModuleUnitMemberChangeType.DELETED.toString();
    }

    if(getSourceState() == null) {
      throw new IllegalStateException("If change is not DELETED, it must have source state");
    }

    SourceState state = getSourceState();
    return String.format("%s %s %s (start ln: %d col: %d, end ln: %d col: %d)",
        getChangeType(),
        state.getDefinition(),
        state.getSha1(),
        state.getStartLine(), state.getStartPos(),
        state.getEndLine(), state.getEndPos());
  }

  public ModuleUnitChange getCorrespondingModuleUnitChange() {
    return correspondingModuleUnitChange;
  }

  public void setCorrespondingModuleUnitChange(ModuleUnitChange correspondingModuleUnitChange) {
    this.correspondingModuleUnitChange = correspondingModuleUnitChange;
  }

  public Long getMovedToId() {
    return movedToId;
  }

  public void setMovedToId(Long movedToId) {
    this.movedToId = movedToId;
  }

  public ModuleUnit getMovedTo() {
    return movedTo;
  }

  public void setMovedTo(ModuleUnit movedTo) {
    this.movedTo = movedTo;
  }

  public Long getMovedFromId() {
    return movedFromId;
  }

  public void setMovedFromId(Long movedFromId) {
    this.movedFromId = movedFromId;
  }

  public ModuleUnit getMovedFrom() {
    return movedFrom;
  }

  public void setMovedFrom(ModuleUnit movedFrom) {
    this.movedFrom = movedFrom;
  }
  
  public Long getFileId() {
    return fileId;
  }
  
  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }
  
  public ModuleUnitMember getOrigin() {
    return origin;
  }
  
  public void setOrigin(ModuleUnitMember origin) {
    this.origin = origin;
  }
  
  public Long getOriginId() {
    return originId;
  }
  
  public void setOriginId(Long originId) {
    this.originId = originId;
  }
}
