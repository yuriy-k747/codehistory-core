package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.util.SourcesUtil;

public class ModuleUnitMemberDefinition {
  private final ModuleUnitMember member;
  private final ModuleUnitMemberChange change;
  private final Commit commit;
  
  public ModuleUnitMemberDefinition(ModuleUnitMember member, ModuleUnitMemberChange change, Commit commit) {
    this.member = member;
    this.change = change;
    this.commit = commit;
  }
  
  public String getValue() {
    return SourcesUtil.getMemberDefinitionHtml(member, change, null);
  }
  
  public String getValueCutDef(Integer maxDefSize) {
    return SourcesUtil.getMemberDefinitionHtml(member, change, maxDefSize);
  }
  
  // valueLinked
  public String getValueLinked(String Urls_SourceCard_Member) {
    return SourcesUtil.getMemberDefinitionHtmlLinked(member, change, null, null, Urls_SourceCard_Member);
  }
  
  // valueLinkedCutDef
  public String getValueLinkedCutDef(Integer maxDefSize, String Urls_SourceCard_Member) {
    return getValueLinkedCutDef(maxDefSize, null, Urls_SourceCard_Member);
  }
  
  public String getValueLinkedCutDef(Integer maxDefSize, Long branchId, String Urls_SourceCard_Member) {
    return SourcesUtil.getMemberDefinitionHtmlLinked(member, change, maxDefSize, branchId, Urls_SourceCard_Member);
  }
  
  public ModuleUnitMember getMember() {
    return member;
  }
  
  public ModuleUnitMemberChange getChange() {
    return change;
  }
  
  public Commit getCommit() {
    return commit;
  }
}
