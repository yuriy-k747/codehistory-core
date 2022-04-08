package dev.codehistory.core.index.sources;

import dev.codehistory.core.entities.sources.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompilatorPostProcess {
  private static final Logger log = LoggerFactory.getLogger(CompilatorPostProcess.class);

  private CompilatorPostProcess() {
    throw new IllegalStateException("CompilatorPostProcess is utils");
  }

  public static void postProcess(List<CompileResult> compilationResults) {
    if(compilationResults.size() < 2) {
      return;
    }

    for (int i = 0; i < compilationResults.size(); i++) {
      CompileResult leftRes = compilationResults.get(i);
      for(int j = i + 1; j < compilationResults.size(); j++) {
        CompileResult rightRes = compilationResults.get(j);

        ArrayList<ModuleUnitChange> removeLeft = new ArrayList<>();
        ArrayList<ModuleUnitChange> removeRight = new ArrayList<>();

        List<ModuleUnitChange> unitChanges = rightRes.getModuleUnitChanges();

        if(unitChanges != null && leftRes.getModuleUnitChanges() != null) {
          postProcessUnitChanges(leftRes, rightRes, removeLeft, removeRight);
        }

        if(!removeLeft.isEmpty()) {
          remove(leftRes, rightRes, removeLeft, removeRight);
        }
      }
    }
  }

  private static void postProcessUnitChanges(
      CompileResult leftRes,
      CompileResult rightRes,
      ArrayList<ModuleUnitChange> removeLeft,
      ArrayList<ModuleUnitChange> removeRight) {
    for (ModuleUnitChange rightChange : rightRes.getModuleUnitChanges()) {
      // find if same unit has changes in the same commit (so it have same identifier and keyword).
      Optional<ModuleUnitChange> leftItem = probeLeftItem(leftRes, rightChange);

      if (leftItem.isPresent()) {
        ModuleUnitChange leftChange = leftItem.get();
        ModuleUnitChangeType left = leftChange.getChangeType();
        ModuleUnitChangeType right = rightChange.getChangeType();

        if (isMoved(left, right)) {
          if (compareParts(leftChange, rightChange)) {
            if(rightChange.getModuleUnit().getModule().equals(leftChange.getModuleUnit().getModule())) {
              removeLeft.add(leftChange);
              removeRight.add(rightChange);
            } else {
              move(leftRes, rightRes, leftChange, rightChange);
            }
          }
        } else if (left == ModuleUnitChangeType.DELETED && right == ModuleUnitChangeType.DELETED) {
          // legal in case of partial class, ignore
        } else {
          ModuleUnit leftUnit = leftChange.getModuleUnit();
          ModuleUnit rightUnit = rightChange.getModuleUnit();

          // there might be same-named units, but it is suspicious if they haves same sources, so log it (COPY-PASTE?)
          if(leftUnit.getSourceState().getSha1().equals(rightUnit.getSourceState().getSha1())) {
            String warning =
                String.format("==> WARN:[ILLEGAL STATE ACTION REQUIRED]: '%s' invalid change type pair:\r\n" +
                        " : %s [%s] \r\n" +
                        " : %s [%s]",
                    leftChange.getModuleUnit().getIdentifier(),
                    leftRes.getFilePath(), left.toString(),
                    rightRes.getFilePath(), right.toString());

            log.error(warning);
          }
        }
      }
    }
  }
  
  private static boolean isMoved(ModuleUnitChangeType left, ModuleUnitChangeType right) {
    return (left == ModuleUnitChangeType.ADDED && right == ModuleUnitChangeType.DELETED)
        || (left == ModuleUnitChangeType.DELETED && right == ModuleUnitChangeType.ADDED);
  }
  
  private static void move(
      CompileResult leftRes,
      CompileResult rightRes,
      ModuleUnitChange leftUnitChange,
      ModuleUnitChange rightUnitChange) {
    leftUnitChange.setChangeType(ModuleUnitChangeType.MOVED_FROM);
    leftUnitChange.setMovedFrom(rightUnitChange.getModuleUnit().getModule());
    leftUnitChange.setOrigin(rightUnitChange.getModuleUnit());
    rightUnitChange.setChangeType(ModuleUnitChangeType.MOVED_TO);
    rightUnitChange.setMovedTo(leftUnitChange.getModuleUnit().getModule());
    rightUnitChange.setOrigin(leftUnitChange.getModuleUnit());
  
    for (ModuleUnitMemberChange leftMemberChange : leftRes.getModuleUnitMemberChanges()) {
      if(!leftMemberChange.getModuleUnitMember().getModuleUnit().equals(leftUnitChange.getModuleUnit())) {
        continue;
      }
      
      for (ModuleUnitMemberChange rightMemberChange : rightRes.getModuleUnitMemberChanges()) {
        if(!rightMemberChange.getModuleUnitMember().getModuleUnit().equals(rightUnitChange.getModuleUnit())) {
          continue;
        }
        
        if(leftMemberChange.getModuleUnitMember().getSourceState().getSha1().equals(rightMemberChange.getModuleUnitMember().getSourceState().getSha1())) {
          leftMemberChange.setChangeType(ModuleUnitMemberChangeType.MOVED_FROM);
          leftMemberChange.setMovedFrom(rightUnitChange.getModuleUnit());
          leftMemberChange.setOrigin(
              SourceFileDiffCompiler.findOrigin(rightUnitChange.getModuleUnit(), leftMemberChange.getModuleUnitMember())
          );
          
          rightMemberChange.setChangeType(ModuleUnitMemberChangeType.MOVED_TO);
          rightMemberChange.setMovedTo(leftUnitChange.getModuleUnit());
          rightMemberChange.setOrigin(
              SourceFileDiffCompiler.findOrigin(leftUnitChange.getModuleUnit(), rightMemberChange.getModuleUnitMember())
          );
        }
      }
    }
  }

  private static void remove(
      CompileResult leftRes,
      CompileResult rightRes,
      ArrayList<ModuleUnitChange> removeLeft,
      ArrayList<ModuleUnitChange> removeRight) {

    ArrayList<ModuleUnitMemberChange> removeMembersLeft = new ArrayList<>();
    ArrayList<ModuleUnitMemberChange> removeMembersRight = new ArrayList<>();

    detectMembers(removeLeft, leftRes, removeMembersLeft);
    detectMembers(removeRight, rightRes, removeMembersRight);

    leftRes.getModuleUnitMemberChanges().removeAll(removeMembersLeft);
    rightRes.getModuleUnitMemberChanges().removeAll(removeMembersRight);

    leftRes.getModuleUnitChanges().removeAll(removeLeft);
    rightRes.getModuleUnitChanges().removeAll(removeRight);
  }

  private static void detectMembers(
      ArrayList<ModuleUnitChange> remove,
      CompileResult res,
      ArrayList<ModuleUnitMemberChange> membersRemove
  ) {
    for(ModuleUnitChange change : remove) {
      res.getModuleUnitMemberChanges().removeAll(change.getModuleUnit().getModuleUnitMembers());
      for(ModuleUnitMemberChange memberChange : res.getModuleUnitMemberChanges()) {
        if(memberChange.getModuleUnitMember().getModuleUnit().getIdentifier().equals(change.getModuleUnit().getIdentifier())) {
          membersRemove.add(memberChange);
        }
      }
    }
  }

  private static boolean compareParts(ModuleUnitChange left, ModuleUnitChange right) {
    if(left.getModuleUnit().getModuleUnitMembers().size() != right.getModuleUnit().getModuleUnitMembers().size()) {
      return false;
    }

    int matches = 0;

    for (ModuleUnitMember unitMember : left.getModuleUnit().getModuleUnitMembers()) {
      var probe = right.getModuleUnit().getModuleUnitMembers().stream()
          .filter(m -> m.getSourceState().getSha1().equals(unitMember.getSourceState().getSha1()))
          .findFirst();

      if(probe.isPresent()) {
        matches++;
      }
    }

    return matches == left.getModuleUnit().getModuleUnitMembers().size();
  }

  private static Optional<ModuleUnitChange> probeLeftItem(CompileResult leftRes, ModuleUnitChange rightChange) {
    return leftRes.getModuleUnitChanges().stream()
        .filter(c -> c.getModuleUnit().equals(rightChange.getModuleUnit()))
        .findFirst();
  }
}
