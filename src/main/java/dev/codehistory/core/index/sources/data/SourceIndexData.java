package dev.codehistory.core.index.sources.data;

import dev.codehistory.core.entities.git.*;
import dev.codehistory.core.entities.sources.Module;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.sources.CompilatorPostProcess;
import dev.codehistory.core.index.sources.CompileResult;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

public class SourceIndexData extends LocalSourceIndexData {
  private final ConcurrentHashMap<ParseErrorFile, ParseErrorFile> parseErrorFiles = new ConcurrentHashMap<>();
  private final ConcurrentHashMap<CommitFileChange, CommitFileChange> commitFileChanges = new ConcurrentHashMap<>();
  private final ConcurrentHashMap<String, Dir> dirs = new ConcurrentHashMap<>();
  private final ConcurrentHashMap<String, File> files = new ConcurrentHashMap<>();
  private final ConcurrentHashMap<FileHunk, FileHunk> fileHunks = new ConcurrentHashMap<>();
  private final ConcurrentHashMap<FileEdit, FileEdit> fileEdits = new ConcurrentHashMap<>();

  public SourceIndexData(SourceIndexDataSnapshot snapshot) {

    for(ParseErrorFile parseErrorFile : snapshot.parseErrorFiles) {
      put(parseErrorFiles, parseErrorFile);
    }

    for(Module module : snapshot.modules) {
      put(modules, module);
    }

    for(ModuleUnit moduleUnit : snapshot.moduleUnits) {
      put(moduleUnits, moduleUnit);
    }

    for(ModuleUnitMember moduleUnitMember : snapshot.moduleUnitMembers) {
      put(moduleUnitMembers, moduleUnitMember);
    }

    for(ModuleUnitChange moduleUnitChange : snapshot.moduleUnitChanges) {
      put(moduleUnitChanges, moduleUnitChange);
    }

    for(ModuleUnitMemberChange moduleUnitMemberChange : snapshot.moduleUnitMemberChanges) {
      put(moduleUnitMemberChanges, moduleUnitMemberChange);
    }

    for(File file : snapshot.files) {
      put(file.getPath(), file);
    }

    for(Dir dir : snapshot.dirs) {
      put(dir.getPath(), dir);
    }

    for(CommitFileChange commitFileChange : snapshot.commitFileChanges) {
      put(commitFileChange);
    }

    for(FileHunk fileHunk : snapshot.fileHunks) {
      put(fileHunk);
    }

    for(FileEdit fileEdit : snapshot.fileEdits) {
      put(fileEdit);
    }
  }

  public ParseErrorFile put(ParseErrorFile parseErrorFile) {
    return put(parseErrorFiles, parseErrorFile);
  }

  public ConcurrentMap<String, File> getFiles() {
    return files;
  }

  public ConcurrentMap<ParseErrorFile, ParseErrorFile> getParseErrorFiles() {
    return parseErrorFiles;
  }

  public Dir put(String path, Dir dir) {
    return put(this.dirs, path, dir);
  }

  public File put(String path, File file) {
    return put(this.files, path, file);
  }

  public FileHunk put(FileHunk fileHunk) {
    return put(this.fileHunks, fileHunk);
  }

  public FileEdit put(FileEdit fileEdit) {
    return put(this.fileEdits, fileEdit);
  }

  public CommitFileChange put(CommitFileChange commitFileChange) {
    if(commitFileChanges.containsKey(commitFileChange)) {
      throw new IllegalStateException();
    }

    return put(commitFileChanges, commitFileChange);
  }

  public SourceIndexDataSnapshot toSnapshot() {
    return new SourceIndexDataSnapshot(
        modules.values(),
        moduleUnits.values(),
        moduleUnitChanges.values(),
        moduleUnitMembers.values(),
        moduleUnitMemberChanges.values(),
        parseErrorFiles.values(),
        commitFileChanges.values(),
        dirs.values(),
        files.values(),
        fileHunks.values(),
        fileEdits.values());
  }
  
  public void addError(String newFile, Commit commit) {
    File file = getFiles().get(newFile);
    
    ParseErrorFile parseErrorFile = new ParseErrorFile();
    if(commit != null) {
      parseErrorFile.setCommit(commit);
      parseErrorFile.setCommitId(commit.getId());
    }
    
    parseErrorFile.setFile(file);
    parseErrorFile.setFileId(file.getId());
    put(parseErrorFile);
  }
  
  public void addError(String newFile) {
    addError(newFile, null);
  }
  
  public void addChanges(List<CompileResult> compilationResults, Commit commit, Consumer<String> logging) {
    CompilatorPostProcess.postProcess(compilationResults, logging);
  
    for(CompileResult res : compilationResults) {
      String filePath = res.getFilePath();
      
      if (res.isFaulted()) {
        // we don't need to compile old file parse error, because it already/will be compiled when time for this parent commit will come.
        if (!res.getNewCriticalErrors().isEmpty()) {
          addError(filePath, commit);
        }
      } else {
        addChange(res, filePath);
      }
    }
  }
  
  public void addChange(CompileResult res, String newFile) {
    File file = getFiles().get(newFile);
    
    for (ModuleUnitChange unitChange : res.getModuleUnitChanges()) {
      Module collectedModule = unitChange.getModuleUnit().getModule();
      Module realModule = put(collectedModule);
      
      ModuleUnit collectedModulUnit = unitChange.getModuleUnit();
      ModuleUnit realModuleUnit = put(collectedModulUnit);
      realModuleUnit.setModule(realModule);
      
      unitChange.setFile(file);
      unitChange.setFiletId(file.getId());
      unitChange.setModuleUnit(realModuleUnit);
      unitChange.setModuleUnitId(realModuleUnit.getId());
      
      if(unitChange.getMovedFrom() != null) {
        Module realMovedFromModule = put(unitChange.getMovedFrom());
        unitChange.setMovedFrom(realMovedFromModule);
      }
      
      if(unitChange.getMovedTo() != null) {
        Module realMovedToModule = put(unitChange.getMovedTo());
        unitChange.setMovedTo(realMovedToModule);
      }
      
      if(unitChange.getOrigin() != null) {
        ModuleUnit realOriginUnit = put(unitChange.getOrigin());
        unitChange.setOrigin(realOriginUnit);
      }
      
      put(unitChange);
    }
    
    for (ModuleUnitMemberChange memberChange : res.getModuleUnitMemberChanges()) {
      Module collectedModule = memberChange.getModuleUnitMember().getModuleUnit().getModule();
      Module realModule = put(collectedModule);
      
      ModuleUnit collectedModuleUnit = memberChange.getModuleUnitMember().getModuleUnit();
      ModuleUnit realModuleUnit = put(collectedModuleUnit);
      realModuleUnit.setModule(realModule);
      
      ModuleUnitMember collectedModuleUnitMember = memberChange.getModuleUnitMember();
      ModuleUnitMember realModuleUnitMember = put(collectedModuleUnitMember);
      realModuleUnitMember.setModuleUnit(realModuleUnit);
      
      if(memberChange.getMovedFrom() != null) {
        ModuleUnit movedFrom = memberChange.getMovedFrom();
        ModuleUnit realMovedFrom = put(movedFrom);
        memberChange.setMovedFrom(realMovedFrom);
      }
      
      if(memberChange.getMovedTo() != null) {
        ModuleUnit movedTo = memberChange.getMovedTo();
        ModuleUnit realMovedTo = put(movedTo);
        memberChange.setMovedTo(realMovedTo);
      }
      
      if(memberChange.getOrigin() != null) {
        ModuleUnitMember origin = memberChange.getOrigin();
        ModuleUnitMember realOrigin = put(origin);
        memberChange.setOrigin(realOrigin);
      }
      
      memberChange.setModuleUnitMember(realModuleUnitMember);
      memberChange.setModuleUnitMemberId(realModuleUnitMember.getId());
      
      memberChange.setFile(file);
      
      put(memberChange);
    }
  }
}
