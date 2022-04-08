package dev.codehistory.core.util;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.views.HasCommit;
import dev.codehistory.core.views.commit.CommitViewModuleUnitMember;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.text.StringSubstitutor;

import java.util.*;
import java.util.stream.Collectors;

public class SourcesUtil {
  private static final String SpanHeaderTemplate = "<span class=\"module-member-identifier\">%s</span>";
  private static final String SpanHeaderUnitTemplate = "<span class=\"module-unit-identifier\">%s</span>";

  private SourcesUtil() {
    throw new IllegalStateException("SourcesUtil is utils");
  }

  public static <T extends HasCommit> List<T> removeDuplicates(Collection<T> source) {
    List<T> res = new ArrayList<>(source.size());
    HashMap<String, List<Commit>> uniques = new HashMap<>();
    
    for (T hasCommit : source) {
      Commit commit = hasCommit.getCommit();
      String key = getCommitUniqueKey(commit);
      
      if(uniques.containsKey(key)) {
        List<Commit> bucket = uniques.get(key);
        bucket.add(commit);
      } else {
        List<Commit> bucket = new ArrayList<>();
        bucket.add(commit);
        uniques.put(key, bucket);
      }
    }
  
    HashSet<String> addedUniques = new HashSet<>();
    for (T hasCommit : source) {
      Commit commit = hasCommit.getCommit();
      String key = getCommitUniqueKey(commit);
      if(addedUniques.contains(key)) {
        continue;
      } else {
        addedUniques.add(key);
      }
      
      List<Commit> bucket = uniques.get(key);
      
      if(bucket.isEmpty()) {
        throw new IllegalStateException();
      }
      
      if(bucket.size() == 1) {
        res.add(hasCommit);
      } else {
        LinkedList<Commit> priorityList = new LinkedList<>();
        
        int inBranches = 0;
        for (Commit item : bucket) {
          if (item.getCommiterId() == null) {
            if (item.getInBranches().size() > inBranches) {
              inBranches = item.getInBranches().size();
              priorityList.add(0, item);
            } else {
              priorityList.add(item);
            }
          }
        }
  
        for (Commit item : bucket) {
          if(item.getCommiterId() != null) {
            priorityList.add(item);
          }
        }
  
        for (int i = 0; i < priorityList.size(); i++) {
          if(i == 0) {
            res.add(hasCommit);
          } else {
            Commit main = priorityList.get(0);
            main.getDuplicates().add(priorityList.get(i));
          }
        }
      }
    }
    
    return res;
  }
  
  private static String getCommitUniqueKey(Commit commit) {
    return String.format("%d%s%d", commit.getAuthor().getId(), commit.getShortMessage(), commit.getCreated().getTime());
  }
  
  public static void arrangeContent(ModuleUnit unit) {
    List<ModuleUnitMember> members = new ArrayList<>(unit.getModuleUnitMembers().size());
    members.addAll(getByCategory(unit, ModuleUnitMember.Field));
    members.addAll(getByCategory(unit, ModuleUnitMember.Constructor));
    members.addAll(getByCategory(unit, ModuleUnitMember.Property));
    members.addAll(getByCategory(unit, ModuleUnitMember.Method));
    members.addAll(getByCategory(unit, ModuleUnitMember.Indexer));
    members.addAll(getByCategory(unit, ModuleUnitMember.Operator));
    members.addAll(getByCategory(unit, ModuleUnitMember.Event));
    members.addAll(getByCategory(unit, ModuleUnitMember.StaticBlock));
    
    unit.setModuleUnitMembers(members);
  }
  
  public static void arrangeContent(List<ModuleUnit> units) {
    for (ModuleUnit unit : units) {
      arrangeContent(unit);
    }
  }
  
  public static Collection<CommitViewModuleUnitMember> arrangeContent(Collection<CommitViewModuleUnitMember> members) {
    Collection<CommitViewModuleUnitMember> res = new ArrayList<>(members.size());
    res.addAll(getByCategory(members, ModuleUnitMember.Field));
    res.addAll(getByCategory(members, ModuleUnitMember.Constructor));
    res.addAll(getByCategory(members, ModuleUnitMember.Property));
    res.addAll(getByCategory(members, ModuleUnitMember.Method));
    res.addAll(getByCategory(members, ModuleUnitMember.Indexer));
    res.addAll(getByCategory(members, ModuleUnitMember.Operator));
    res.addAll(getByCategory(members, ModuleUnitMember.Event));
    res.addAll(getByCategory(members, ModuleUnitMember.StaticBlock));

    return res;
  }
  
  public static List<ModuleUnitMember> getByCategory(ModuleUnit unit, String category) {
    return unit.getModuleUnitMembers().stream()
        .filter(moduleUnitMember -> moduleUnitMember.getCategory().equals(category))
        .sorted(Comparator.comparing(SourcePart::getIdentifier))
        .collect(Collectors.toUnmodifiableList());
  }
  
  public static List<CommitViewModuleUnitMember> getByCategory(Collection<CommitViewModuleUnitMember> members, String category) {
    List<CommitViewModuleUnitMember> combined = new ArrayList<>();
    List<CommitViewModuleUnitMember> added = getByCategoryAndChangeType(members, category, ModuleUnitMemberChangeType.ADDED);
    List<CommitViewModuleUnitMember> changed = getByCategoryAndChangeType(members, category, ModuleUnitMemberChangeType.CHANGED);
    List<CommitViewModuleUnitMember> deleted = getByCategoryAndChangeType(members, category, ModuleUnitMemberChangeType.DELETED);
    List<CommitViewModuleUnitMember> movedTo = getByCategoryAndChangeType(members, category, ModuleUnitMemberChangeType.MOVED_TO);
    List<CommitViewModuleUnitMember> movedFrom = getByCategoryAndChangeType(members, category, ModuleUnitMemberChangeType.MOVED_FROM);
  
    if(added != null) {
      combined.addAll(added);
    }
    
    if(changed != null) {
      combined.addAll(changed);
    }
    
    if(deleted != null) {
      combined.addAll(deleted);
    }
    
    if(movedTo != null) {
      combined.addAll(movedTo);
    }
    
    if(movedFrom != null) {
      combined.addAll(movedFrom);
    }
    
    return combined;
  }
  
  private static List<CommitViewModuleUnitMember> getByCategoryAndChangeType(Collection<CommitViewModuleUnitMember> members, String category, ModuleUnitMemberChangeType type) {
    return members.stream()
        .filter(moduleUnitMember -> moduleUnitMember.getCategory().equals(category) && moduleUnitMember.getMemberChange().getChangeType().equals(type))
        .sorted(Comparator.comparing(commitViewModuleUnitMember -> commitViewModuleUnitMember.getMember().getIdentifier()))
        .collect(Collectors.toUnmodifiableList());
  }
  
  public static String getUnitDefinition(ModuleUnit moduleUnit, ModuleUnitChange moduleUnitChange) {
    String definition = moduleUnitChange.getSourceState().getDefinition();
    String keyword = moduleUnit.getKeyword();
    String identifier = moduleUnit.getIdentifier();

    return fillUnitDefinition(definition, keyword, identifier);
  }
  
  public static String getMemberDefinitionHtml(ModuleUnitMember moduleUnitMember, ModuleUnitMemberChange moduleUnitChange, Integer maxDefSize) {
    String definition = moduleUnitChange.getSourceState().getDefinition();
    if(maxDefSize != null) {
      definition = dev.codehistory.core.util.StringUtils.getShortLeft(definition, maxDefSize);
    }
    
    String identifier = moduleUnitMember.getIdentifier();
    
    return fillMemberDefinitionHtml(definition, identifier);
  }
  
  public static String getMemberDefinitionHtmlLinked(ModuleUnitMember moduleUnitMember, ModuleUnitMemberChange moduleUnitChange, Integer maxDefSize, Long branchId, String Urls_SourceCard_Member) {
    String definition = moduleUnitChange.getSourceState().getDefinition();
    if(maxDefSize != null) {
      definition = dev.codehistory.core.util.StringUtils.getShortLeft(definition, maxDefSize);
    }
    
    String identifier = moduleUnitMember.getIdentifier();
    
    return fillMemberDefinitionHtmlLinked(moduleUnitMember.getId(), definition, identifier, branchId, Urls_SourceCard_Member);
  }

  public static ModuleUnitMemberChange firstMember(Collection<ModuleUnitMemberChange> changes, String identifier) {
    Optional<ModuleUnitMemberChange> tryFind = changes.stream()
        .filter(c -> c.getModuleUnitMember().getIdentifier().equals(identifier))
        .findFirst();

    if (!tryFind.isPresent()) {
      throw new RuntimeException("Not found");
    }

    return tryFind.get();
  }

  public static ModuleUnitChange firstUnit(Collection<ModuleUnitChange> changes, String identifier) {
    Optional<ModuleUnitChange> tryFind = changes.stream()
        .filter(c -> c.getModuleUnit().getIdentifier().equals(identifier))
        .findFirst();

    if (!tryFind.isPresent()) {
      throw new RuntimeException("Not found");
    }

    return tryFind.get();
  }

  public static String fillMemberDefinition(String definition, String identifier) {
    return SourcesUtil.fillMemberDefinition(definition, identifier);
  }

  public static String fillMemberDefinitionHtml(String definition, String identifier) {
    Map<String, String> values = new HashMap<>();
    values.put(SourcePart.Identifier, String.format(SpanHeaderTemplate, StringEscapeUtils.escapeHtml4(identifier)));
    StringSubstitutor sub = new StringSubstitutor(values, "%(", ")");
  
    return String.format("<span class=\"module-member-definition\">%s</span>", sub.replace(StringEscapeUtils.escapeHtml4(definition)));
  }
  
  public static String fillMemberDefinitionHtmlLinked(Long id, String definition, String identifier, Long branchId, String Urls_SourceCard_Member) {
    Map<String, String> values = new HashMap<>();
    
    if(branchId != null) {
      values.put(SourcePart.Identifier, String.format(SpanHeaderTemplate,
          String.format("<a class=\"source-entity-unit\" href=\"%s%d/%d\">%s</a>", StringEscapeUtils.escapeHtml4(Urls_SourceCard_Member), id, branchId, StringEscapeUtils.escapeHtml4(identifier))
      ));
    } else {
      values.put(SourcePart.Identifier, String.format(SpanHeaderTemplate,
          String.format("<a class=\"source-entity-unit\" href=\"%s%d\">%s</a>", StringEscapeUtils.escapeHtml4(Urls_SourceCard_Member), id, StringEscapeUtils.escapeHtml4(identifier))
      ));
    }
    
    StringSubstitutor sub = new StringSubstitutor(values, "%(", ")");
    
    return String.format("<span class=\"module-member-definition\">%s</span>", sub.replace(StringEscapeUtils.escapeHtml4(definition)));
  }
  
  public static String fillUnitDefinition(String definition, String keyword, String identifier) {
    Map<String, String> values = new HashMap<>();
    values.put(ModuleUnit.Keyword, keyword);
    values.put(SourcePart.Identifier, identifier);
    StringSubstitutor sub = new StringSubstitutor(values, "%(", ")");

    return sub.replace(definition);
  }
  
  public static String fillUnitDefinitionHtml(String definition, String keyword, String identifier) {
    Map<String, String> values = new HashMap<>();
    values.put(ModuleUnit.Keyword, String.format("<span class=\"module-unit-keyword\">%s</span>", StringEscapeUtils.escapeHtml4(keyword)));
    values.put(SourcePart.Identifier, String.format(SpanHeaderUnitTemplate, StringEscapeUtils.escapeHtml4(identifier)));
    StringSubstitutor sub = new StringSubstitutor(values, "%(", ")");
    
    return String.format("<span class=\"module-unit-definition\">%s</span>", sub.replace(definition == null ? null : StringEscapeUtils.escapeHtml4(definition)));
  }
  
  public static String fillUnitDefinitionHtmlLinked(Long id, String definition, String keyword, String identifier, Long branchId, String Urls_SourceCard_Unit) {
    Map<String, String> values = new HashMap<>();
    values.put(ModuleUnit.Keyword, String.format("<span class=\"module-unit-keyword\">%s</span>", StringEscapeUtils.escapeHtml4(keyword)));
    
    if(branchId != null) {
      values.put(SourcePart.Identifier, String.format(SpanHeaderUnitTemplate,
          String.format("<a class=\"source-entity-unit\" href=\"%s%d/%d\">%s</a>", Urls_SourceCard_Unit, id, branchId, StringEscapeUtils.escapeHtml4(identifier))
      ));
    } else {
      values.put(SourcePart.Identifier, String.format(SpanHeaderUnitTemplate,
          String.format("<a class=\"source-entity-unit\" href=\"%s%d\">%s</a>", Urls_SourceCard_Unit, id, StringEscapeUtils.escapeHtml4(identifier))
      ));
    }
    
    StringSubstitutor sub = new StringSubstitutor(values, "%(", ")");
    
    return String.format("<span class=\"module-unit-definition\">%s</span>", sub.replace(StringEscapeUtils.escapeHtml4(definition)));
  }
  
  public static String getUnitDefinitionHtmlLinked(ModuleUnit moduleUnit, ModuleUnitChange moduleUnitChange, Integer maxDefSize, Long branchId, String Urls_SourceCard_Unit) {
    String definition = moduleUnitChange.getSourceState().getDefinition();
    if(maxDefSize != null) {
      definition = StringUtils.getShortLeft(definition == null ? "" : definition, maxDefSize);
    }
    
    String keyword = moduleUnit.getKeyword();
    String identifier = moduleUnit.getIdentifier();
    
    return fillUnitDefinitionHtmlLinked(moduleUnit.getId(), definition, keyword, identifier, branchId, Urls_SourceCard_Unit);
  }
  
  public static Pair<String, String>[] buildIdentifiers(String[] filterVals) {
    Pair<String, String>[] res = new Pair[filterVals.length];

    for(int i = 0; i < filterVals.length; i++) {
      String val = filterVals[i];
      int dotIndex = val.indexOf(".");
      if(dotIndex == -1) {
        res[i] = Pair.of(null, val);
      } else {
        res[i] = Pair.of(val.substring(0, dotIndex), val.substring(dotIndex + 1));
      }
    }

    return res;
  }
  
  public static String getUnitDefinitionHtml(ModuleUnit moduleUnit, ModuleUnitChange moduleUnitChange, Integer maxDefSize) {
    String definition = moduleUnitChange.getSourceState().getDefinition();
    if(maxDefSize != null) {
      definition = dev.codehistory.core.util.StringUtils.getShortLeft(definition == null ? "" : definition, maxDefSize);
    }
    
    String keyword = moduleUnit.getKeyword();
    String identifier = moduleUnit.getIdentifier();
    
    return fillUnitDefinitionHtml(definition, keyword, identifier);
  }
  
  public static String getMemberDefinition(ModuleUnitMember moduleUnitMember, ModuleUnitMemberChange moduleUnitChange) {
    String definition = moduleUnitChange.getSourceState().getDefinition();
    String identifier = moduleUnitMember.getIdentifier();
    
    return fillMemberDefinition(definition, identifier);
  }
}
