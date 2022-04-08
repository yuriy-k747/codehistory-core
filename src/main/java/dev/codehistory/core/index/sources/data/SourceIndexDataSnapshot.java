package dev.codehistory.core.index.sources.data;

import dev.codehistory.core.entities.git.*;
import dev.codehistory.core.entities.sources.Module;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.index.DataSnapshot;
import dev.codehistory.core.util.CommonUtil;

import java.util.Collection;
import java.util.HashSet;

public class SourceIndexDataSnapshot extends DataSnapshot {
  public final Collection<Module> modules;
  public final Collection<ModuleUnit> moduleUnits;
  public final Collection<ModuleUnitChange> moduleUnitChanges;
  public final Collection<ModuleUnitMember> moduleUnitMembers;
  public final Collection<ModuleUnitMemberChange> moduleUnitMemberChanges;
  public final Collection<ParseErrorFile> parseErrorFiles;
  public final Collection<CommitFileChange> commitFileChanges;
  public final Collection<Dir> dirs;
  public final Collection<File> files;
  public final Collection<FileHunk> fileHunks;
  public final Collection<FileEdit> fileEdits;
  
  public SourceIndexDataSnapshot() {
    this.modules = new HashSet<>();
    this.moduleUnits = new HashSet<>();
    this.moduleUnitChanges = new HashSet<>();
    this.moduleUnitMembers = new HashSet<>();
    this.moduleUnitMemberChanges = new HashSet<>();
    this.parseErrorFiles = new HashSet<>();
    this.commitFileChanges = new HashSet<>();
    this.dirs = new HashSet<>();
    this.files = new HashSet<>();
    this.fileHunks = new HashSet<>();
    this.fileEdits = new HashSet<>();
  }
  
  public SourceIndexDataSnapshot(
      Collection<Module> modules,
      Collection<ModuleUnit> moduleUnits,
      Collection<ModuleUnitChange> moduleUnitChanges,
      Collection<ModuleUnitMember> moduleUnitMembers,
      Collection<ModuleUnitMemberChange> moduleUnitMemberChanges,
      Collection<ParseErrorFile> parseErrorFiles,
      Collection<CommitFileChange> commitFileChanges,
      Collection<Dir> dirs,
      Collection<File> files,
      Collection<FileHunk> fileHunks,
      Collection<FileEdit> fileEdits) {
    this.modules = modules;
    this.moduleUnits = moduleUnits;
    this.moduleUnitChanges = moduleUnitChanges;
    this.moduleUnitMembers = moduleUnitMembers;
    this.moduleUnitMemberChanges = moduleUnitMemberChanges;
    this.parseErrorFiles = parseErrorFiles;
    this.commitFileChanges = commitFileChanges;
    this.dirs = dirs;
    this.files = files;
    this.fileHunks = fileHunks;
    this.fileEdits = fileEdits;
  }

  public SourceIndexDataSnapshot generateIds() {
    Collection<Module> modulesNew = onlyNew(modules);
    Collection<ModuleUnit> moduleUnitsNew = onlyNew(moduleUnits);
    Collection<ModuleUnitChange> moduleUnitChangesNew = onlyNew(moduleUnitChanges);
    Collection<ModuleUnitMember> moduleUnitMembersNew = onlyNew(moduleUnitMembers);
    Collection<ModuleUnitMemberChange> moduleUnitMemberChangesNew = onlyNew(moduleUnitMemberChanges);
    Collection<ParseErrorFile> parseErrorFilesNew = onlyNew(parseErrorFiles);
    Collection<Dir> dirsNew = onlyNew(dirs);
    Collection<File> filesNew = onlyNew(files);
    Collection<FileHunk> fileHunksNew = onlyNew(fileHunks);
    Collection<FileEdit> fileEditsNew = onlyNew(fileEdits);
    Collection<CommitFileChange> commitFileChangesNew = onlyNew(commitFileChanges);

    generateIds(modulesNew, CommonUtil.lastId(modules) + 1);
    generateIds(moduleUnitsNew, CommonUtil.lastId(moduleUnits) + 1);
    generateIds(moduleUnitChangesNew, CommonUtil.lastId(moduleUnitChanges) + 1);
    generateIds(moduleUnitMembersNew, CommonUtil.lastId(moduleUnitMembers) + 1);
    generateIds(moduleUnitMemberChangesNew, CommonUtil.lastId(moduleUnitMemberChanges) + 1);
    generateIds(parseErrorFilesNew, CommonUtil.lastId(parseErrorFiles) + 1);
    generateIds(dirsNew, CommonUtil.lastId(dirs) + 1);
    generateIds(filesNew, CommonUtil.lastId(files) + 1);
    generateIds(fileHunksNew, CommonUtil.lastId(fileHunks) + 1);
    generateIds(fileEditsNew, CommonUtil.lastId(fileEdits) + 1);
    generateIds(commitFileChangesNew, CommonUtil.lastId(commitFileChanges) + 1);

    return new SourceIndexDataSnapshot(
        modulesNew,
        moduleUnitsNew,
        moduleUnitChangesNew,
        moduleUnitMembersNew,
        moduleUnitMemberChangesNew,
        parseErrorFilesNew,
        commitFileChangesNew,
        dirsNew,
        filesNew,
        fileHunksNew,
        fileEditsNew);
  }
}
