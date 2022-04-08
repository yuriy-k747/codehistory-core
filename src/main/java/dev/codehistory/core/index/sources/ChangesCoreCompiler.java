package dev.codehistory.core.index.sources;

import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.sources.parsers.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ChangesCoreCompiler {
  private final Parser newParser;
  private final Parser oldParser;
  private final List<ModuleUnitChange> unitChanges = new ArrayList<>();
  private final List<ModuleUnitMemberChange> memberChanges = new ArrayList<>();

  public ChangesCoreCompiler(Parser newParser, Parser oldParser) {
    this.newParser = newParser;
    this.oldParser = oldParser;
  }

  public void compile() {
    compare(newParser.getData().getModuleUnits(), oldParser.getData().getModuleUnits(),
        addedSource -> {
          ModuleUnitChange change = new ModuleUnitChange();
          change.setModuleUnit(addedSource);
          setSourceChange(change, addedSource.getSourceState(), ModuleUnitChangeType.ADDED);
          unitChanges.add(change);
        },
        // changed
        (newSource, oldSource) -> {
          ModuleUnitChange change = new ModuleUnitChange();
          change.setModuleUnit(newSource);
          setSourceChange(change, newSource.getSourceState(), ModuleUnitChangeType.CHANGED);
          if(!newSource.getSourceState().getDefinition().equals(oldSource.getSourceState().getDefinition())) {
            change.setPrevDefinition(oldSource.getSourceState().getDefinition());
          }
          
          unitChanges.add(change);
        },
        // unchanged
        (newSource, oldSource) -> {
          // A Place to Remember
        },
        deletedSource -> {
          ModuleUnitChange change = new ModuleUnitChange();
          change.setModuleUnit(deletedSource);
          setSourceChange(change, null, ModuleUnitChangeType.DELETED);
          unitChanges.add(change);
        });

    compare(newParser.getData().getModuleUnitMembers(), oldParser.getData().getModuleUnitMembers(),
        addedSource -> {
          ModuleUnitMemberChange change = new ModuleUnitMemberChange();
          change.setModuleUnitMember(addedSource);
          setSourceChange(change, addedSource.getSourceState(), ModuleUnitMemberChangeType.ADDED);
          memberChanges.add(change);
        },
        // changed
        (newSource, oldSource) -> {
          ModuleUnitMemberChange change = new ModuleUnitMemberChange();
          change.setModuleUnitMember(newSource);
          setSourceChange(change, newSource.getSourceState(), ModuleUnitMemberChangeType.CHANGED);
          memberChanges.add(change);
        },
        // unchanged
        (newSource, oldSource) -> {
          // ignore, it have no side effects for member
        },
        deletedSource -> {
          ModuleUnitMemberChange change = new ModuleUnitMemberChange();
          change.setModuleUnitMember(deletedSource);
          setSourceChange(change, deletedSource.getSourceState(), ModuleUnitMemberChangeType.DELETED);
          memberChanges.add(change);
        });
    
    // [!] Comment this to validate via SQL query from docs
    cleanNotActuallyChanged();
  }
  
  // clean units that actually not changed - members moved, comments edited in the body etc.
  private void cleanNotActuallyChanged() {
    List<ModuleUnitChange> toRemove = new ArrayList<>();
    for (ModuleUnitChange unitChange : unitChanges) {
      int membersChanged = 0;
      for (ModuleUnitMemberChange memberChange : memberChanges) {
        if(memberChange.getModuleUnitMember().getModuleUnit().equals(unitChange.getModuleUnit())) {
          membersChanged++;
        }
      }
    
      if(membersChanged == 0 && unitChange.getPrevDefinition() == null) {
        toRemove.add(unitChange);
      }
    }
  
    unitChanges.removeAll(toRemove);
  }
  
  private <T extends SourcePart> void compare(
      Map<T, T> newData,
      Map<T, T> oldData,
      Consumer<T> added,
      BiConsumer<T, T> changed,
      BiConsumer<T, T> unchanged,
      Consumer<T> deleted) {
    for (Map.Entry<T, T> entry : newData.entrySet()) {
      T newSource = entry.getKey();

      if (!oldData.containsKey(newSource)) {
        added.accept(newSource);
      } else if (oldData.containsKey(newSource)) {
        T oldSource = oldData.get(newSource);
        SourceState oldState = oldSource.getSourceState();
        SourceState newState = newSource.getSourceState();
        
        if (!oldState.getSha1().equals(newState.getSha1())) {
          changed.accept(newSource, oldSource);
        } else {
          unchanged.accept(newSource, oldSource);
        }
      }
    }

    for (var entry : oldData.entrySet()) {
      T oldSource = entry.getKey();
      if (!newData.containsKey(oldSource)) {
        deleted.accept(oldSource);
      }
    }
  }

  private void setSourceChange(ModuleUnitMemberChange sourceChange, SourceState state, ModuleUnitMemberChangeType changeType) {
    sourceChange.setSourceState(state);
    sourceChange.setChangeType(changeType);
  }


  private void setSourceChange(ModuleUnitChange sourceChange, SourceState state, ModuleUnitChangeType changeType) {
    sourceChange.setSourceState(state);
    sourceChange.setChangeType(changeType);
  }

  public List<ModuleUnitChange> getUnitChanges() {
    return unitChanges;
  }

  public List<ModuleUnitMemberChange> getMemberChanges() {
    return memberChanges;
  }
}
