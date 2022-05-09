package dev.codehistory.core.entities.sources;

import com.github.difflib.DiffUtils;
import com.github.difflib.algorithm.DiffException;
import com.github.difflib.patch.Patch;
import dev.codehistory.core.entities.git.File;
import dev.codehistory.core.util.SourcesUtil;
import dev.codehistory.core.util.external.GitUtilCore;

import java.util.ArrayList;
import java.util.List;

public class ModuleUnitChange extends SourceChange {
  private Long moduleUnitId;
  private ModuleUnit moduleUnit;
  private Long filetId;
  private File file;
  private ModuleUnitChangeType changeType;
  private Long movedToId;
  private Module movedTo;
  private Long movedFromId;
  private Module movedFrom;
  private String prevDefinition;
  private Long originId;
  private ModuleUnit origin;

  public String getDefined() {
    return SourcesUtil.fillUnitDefinition(getSourceState().getDefinition(), moduleUnit.getKeyword(), moduleUnit.getIdentifier());
  }
  
  public String getPrevDefined() {
    if(prevDefinition == null) {
      throw new IllegalStateException("prevDefinition is null");
    }
  
    return SourcesUtil.fillUnitDefinition(prevDefinition, moduleUnit.getKeyword(), moduleUnit.getIdentifier());
  }
  
  public String getPrevDefinedDiff() throws DiffException {
    List<String> current = new ArrayList<>();
    current.add(getDefined());
  
    List<String> prev = new ArrayList<>();
    prev.add(getPrevDefined());
  
    Patch<String> diff = DiffUtils.diff(prev, current);
    return GitUtilCore.toUnifiedDiff(moduleUnit.getIdentifier(), prev, diff, 0);
  }
  
  public Long getModuleUnitId() {
    return moduleUnitId;
  }

  public void setModuleUnitId(Long moduleUnitId) {
    this.moduleUnitId = moduleUnitId;
  }

  public ModuleUnit getModuleUnit() {
    return moduleUnit;
  }

  public void setModuleUnit(ModuleUnit moduleUnit) {
    this.moduleUnit = moduleUnit;
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public Long getFiletId() {
    return filetId;
  }

  public void setFiletId(Long filetId) {
    this.filetId = filetId;
  }

  public ModuleUnitChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(ModuleUnitChangeType sourceChangeType) {
    this.changeType = sourceChangeType;
  }

  @Override
  public String toString() {
    if (getChangeType() == ModuleUnitChangeType.DELETED) {
      return ModuleUnitChangeType.DELETED.toString();
    }

    if (getChangeType() == ModuleUnitChangeType.MOVED_TO) {
      return String.format("%s%s %s", getShortSha1(), getChangeType(), movedTo.getName());
    }

    if (getSourceState() == null) {
      throw new IllegalStateException("If change is not DELETED, it must have source state");
    }
    
    String changeTypeVal;
    if(getChangeType() == ModuleUnitChangeType.MOVED_FROM) {
      changeTypeVal = ModuleUnitChangeType.MOVED_FROM + " " + movedFrom.getName();
    } else {
      changeTypeVal = getChangeType().toString();
    }
  
    SourceState state = getSourceState();
    String definition = state.getDefinition();
    if(moduleUnit != null) {
      definition = SourcesUtil.fillUnitDefinition(definition, moduleUnit.getKeyword(), moduleUnit.getIdentifier());
    }
    
    return String.format("%s%s %s (start ln: %d col: %d, end ln: %d col: %d)",
        getShortSha1(),
        changeTypeVal,
        definition,
        state.getStartLine(), state.getStartPos(),
        state.getEndLine(), state.getEndPos());
  }
  
  public Long getMovedToId() {
    return movedToId;
  }

  public void setMovedToId(Long movedToId) {
    this.movedToId = movedToId;
  }

  public Module getMovedTo() {
    return movedTo;
  }

  public void setMovedTo(Module movedTo) {
    this.movedTo = movedTo;
  }

  public Long getMovedFromId() {
    return movedFromId;
  }

  public void setMovedFromId(Long movedFromId) {
    this.movedFromId = movedFromId;
  }

  public Module getMovedFrom() {
    return movedFrom;
  }

  public void setMovedFrom(Module movedFrom) {
    this.movedFrom = movedFrom;
  }
  
  public String getPrevDefinition() {
    return prevDefinition;
  }
  
  public void setPrevDefinition(String prevDefinition) {
    this.prevDefinition = prevDefinition;
  }
  
  public ModuleUnit getOrigin() {
    return origin;
  }
  
  public void setOrigin(ModuleUnit origin) {
    this.origin = origin;
  }
  
  public Long getOriginId() {
    return originId;
  }
  
  public void setOriginId(Long originId) {
    this.originId = originId;
  }
  
  private String getShortSha1() {
    String sha = "";
    if(getCommit() != null) {
      sha = getCommit().getShortSha1() + " ";
    }
    
    return sha;
  }
}
