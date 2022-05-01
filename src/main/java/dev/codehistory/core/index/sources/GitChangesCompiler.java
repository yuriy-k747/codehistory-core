package dev.codehistory.core.index.sources;

import com.github.difflib.DiffUtils;
import com.github.difflib.algorithm.DiffException;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.Patch;
import dev.codehistory.core.entities.diff.*;
import dev.codehistory.core.entities.git.*;
import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import dev.codehistory.core.index.sources.data.SourceIndexData;
import dev.codehistory.core.util.CommonUtil;
import dev.codehistory.core.util.KnownNonBinaryExtensions;
import dev.codehistory.core.util.external.GitUtilCore;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.diff.Edit;
import org.eclipse.jgit.diff.EditList;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Config;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.patch.FileHeader;
import org.eclipse.jgit.patch.HunkHeader;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.treewalk.AbstractTreeIterator;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.EmptyTreeIterator;
import org.eclipse.jgit.util.io.DisabledOutputStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;

public class GitChangesCompiler extends ChangesCompiler {
  private final String repoPath;
  private final SourceIndexData sourceIndexData;
  private final Map<Commit, Commit> slimCommits;
  private final Set<String> filePathFilter;

  public GitChangesCompiler(String repoPath, SourceIndexData sourceIndexData, Collection<Commit> slimCommits) {
    this.repoPath = repoPath;
    this.sourceIndexData = sourceIndexData;
    this.slimCommits = CommonUtil.fromCollectionToMirrorMap(slimCommits);
    this.filePathFilter = null;
  }
  
  public GitChangesCompiler(String repoPath, SourceIndexData sourceIndexData, Set<String> filePathFilter) {
    this.repoPath = repoPath;
    this.sourceIndexData = sourceIndexData;
    this.slimCommits = new HashMap<>();
    this.filePathFilter = filePathFilter;
  }

  public void index(Commit commit) throws IOException {
    index(commit, System.out::println);
  }

  public void index(Commit commit, Consumer<String> logging) throws IOException {
    try (FileRepository repository = new FileRepository(this.repoPath)) {
      RevCommit revCommit = repository.parseCommit(commit.getObjectId());

      Pack pack = extractDiffPack(commit, revCommit, repository, logging);
      List<CompileResult> compilationResults = compileDiff(pack);

      if (revCommit.getParentCount() == 0) {
        for (CompileResult res : compilationResults) {
          if (res != null) {
            if (res.isFaulted()) {
              // we don't need to compile old file parse error, because it already/will be compiled when time for this parent commit will come.
              if (!res.getNewCriticalErrors().isEmpty()) {
                sourceIndexData.addError(res.getFilePath(), commit);
              }
            } else {
              res.setCommits(commit, null);
              sourceIndexData.addChange(res, res.getFilePath());
            }
          }
        }
      } else {
        for (RevCommit parent : revCommit.getParents()) {
          Commit commitParent = new Commit();
          commitParent.setObjectId(parent.getId());
          commitParent = CommonUtil.put(slimCommits, commitParent);

          for (CompileResult res : compilationResults) {
            for (ModuleUnitChange unitChange : res.getModuleUnitChanges()) {
              unitChange.setCommits(commit, commitParent);
            }
            for (ModuleUnitMemberChange memberChange : res.getModuleUnitMemberChanges()) {
              memberChange.setCommits(commit, commitParent);
            }
          }

          sourceIndexData.addChanges(compilationResults, logging);
        }
      }
    }
  }

  private boolean skip(String filePath) {
    return filePathFilter != null && !filePathFilter.contains(filePath);
  }

  private Pack extractDiffPack(Commit commit, RevCommit revCommit, Repository repository, Consumer<String> logging) throws IOException {
    Pack res = new Pack();

    if (revCommit.getParentCount() == 0) {
      res.getDiffs().addAll(processTree(repository, commit, null, revCommit, null, logging));
    } else {
      for (int i = 0; i < revCommit.getParentCount(); i++) {
        RevCommit revParentCommit = repository.parseCommit(revCommit.getParent(i));
        Commit commitParent = new Commit();
        commitParent.setObjectId(revParentCommit.getId());
        commitParent = CommonUtil.put(slimCommits, commitParent);

        res.getDiffs().addAll(processTree(repository, commit, commitParent, revCommit, revParentCommit, logging));
      }
    }

    return res;
  }

  private CommitFileChange extractRenamedCommitFileChange(Commit commit, Commit commitParent, File oldFile, File newFile) {
    CommitFileChange commitFileChange = new CommitFileChange();
    commitFileChange.setCommit(commit);
    commitFileChange.setCommitParent(commitParent);
    commitFileChange.setFile(newFile);
    commitFileChange.setOldRenamedFile(oldFile);
    commitFileChange.setChangeType(FileChangeType.RENAMED);

    return doExtractCommitFileChange(commit, commitFileChange);
  }

  private CommitFileChange extractCopiedCommitFileChange(Commit commit, Commit commitParent, File oldFile, File newFile) {
    CommitFileChange commitFileChange = new CommitFileChange();
    commitFileChange.setCommit(commit);
    commitFileChange.setCommitParent(commitParent);
    commitFileChange.setFile(newFile);
    commitFileChange.setOldCopiedFile(oldFile);
    commitFileChange.setChangeType(FileChangeType.COPIED);

    return doExtractCommitFileChange(commit, commitFileChange);
  }

  private CommitFileChange extractCommitFileChange(Commit commit, Commit commitParent, File file, FileChangeType changeType) {
    CommitFileChange commitFileChange = new CommitFileChange();
    commitFileChange.setCommit(commit);
    commitFileChange.setCommitParent(commitParent);
    commitFileChange.setFile(file);
    commitFileChange.setChangeType(changeType);

    return doExtractCommitFileChange(commit, commitFileChange);
  }

  private CommitFileChange doExtractCommitFileChange(Commit commit, CommitFileChange commitFileChange) {
    CommitFileChange realCommitFileChange = sourceIndexData.put(commitFileChange);
    commit.getFileChanges().add(realCommitFileChange);
    return realCommitFileChange;
  }

  private Set<Diff> processTree(
      Repository repository,
      Commit commit,
      Commit commitParent,
      RevCommit child,
      RevCommit parent,
      Consumer<String> logging) throws IOException {
    Set<Diff> res = new HashSet<>();

    try (ObjectReader readerChild = repository.newObjectReader();
         ObjectReader readerParent = repository.newObjectReader()) {

      try (DiffFormatter diffFormatter = new DiffFormatter(DisabledOutputStream.INSTANCE)) {
        diffFormatter.setReader(readerChild, new Config());
        diffFormatter.setDetectRenames(true);

        CanonicalTreeParser childParser = GitUtilCore.createTreeParser(child.getTree(), readerChild);
        AbstractTreeIterator parentParser = parent == null
            ? new EmptyTreeIterator()
            : GitUtilCore.createTreeParser(parent.getTree(), readerParent);

        List<DiffEntry> diffEntries = diffFormatter.scan(parentParser, childParser);

        for (DiffEntry diffEntry : diffEntries) {
          DiffEntry.ChangeType changeType = diffEntry.getChangeType();
  
          if(skip(diffEntry.getOldPath())) {
            continue;
          }
          
          CommitFileChange commitFileChange;
          if (changeType == DiffEntry.ChangeType.ADD) {
            commitFileChange = addedBlob(commit, commitParent, diffEntry.getNewPath());
          } else if (changeType == DiffEntry.ChangeType.DELETE) {
            commitFileChange = deletedBlob(commit, commitParent, diffEntry.getOldPath());
          } else if (changeType == DiffEntry.ChangeType.RENAME) {
            commitFileChange = renamedBlob(commit, commitParent, diffEntry.getOldPath(), diffEntry.getNewPath());
          } else if (changeType == DiffEntry.ChangeType.COPY) {
            commitFileChange = copiedBlob(commit, commitParent, diffEntry.getOldPath(), diffEntry.getNewPath());
          } else {
            commitFileChange = modifiedBlob(commit, commitParent, diffEntry.getOldPath());
          }

          ObjectId newId = diffEntry.getNewId().toObjectId();
          ObjectId oldId = diffEntry.getOldId().toObjectId();
          Diff diff = new DiffObjectId(new DiffPathKey(diffEntry.getOldPath(), diffEntry.getNewPath()), repository, newId, oldId);
          res.add(diff);

          commitFileChange.setNewId(newId);
          commitFileChange.setOldId(oldId);

          try {
            String path = diffEntry.getNewPath();
            if(path == null || path.equals("/dev/null")) {
              path = diffEntry.getOldPath();
            }

            String type = Files.probeContentType(Paths.get(path));
            if(type != null && KnownNonBinaryExtensions.isBinary(path)) {
              type = "text";
            }

            if(type != null && type.startsWith("text")) {
              countLines(repository, commitFileChange);
            } else {
              if(type != null && !type.equals("/dev/null")) {
                String message = String.format("Lines will not be count for file \"%s\" since it was detected as binary", path);
                logging.accept(message);
              }
            }
          } catch (MissingObjectException e) {
            logging.accept(String.format("MissingObjectException: \"%s\" while processing countLines: \"%s\"",
                e.getMessage(), commitFileChange.getFile().getPath()));
          } catch (DiffException e) {
            logging.accept(String.format("Failed to count lines for %s to %s",
                commitFileChange.getOldId().name(), commitFileChange.getNewId().name()));
          }
        }
      }
    }

    return res;
  }

  private void countLines(
      Repository repository,
      CommitFileChange commitFileChange) throws IOException, DiffException {
    List<String> oldLines = new ArrayList<>(0);
    List<String>  newLines = new ArrayList<>(0);
    if(!commitFileChange.getOldId().equals(ObjectId.zeroId())) {
      oldLines = GitUtilCore.loadList(repository, commitFileChange.getOldId());
    }

    if(!commitFileChange.getNewId().equals(ObjectId.zeroId())) {
      newLines = GitUtilCore.loadList(repository, commitFileChange.getNewId());
    }

    if(oldLines.isEmpty()) {
      commitFileChange.setLinesDeleted(0);
      commitFileChange.setLinesChanged(0);
      commitFileChange.setLinesAdded(newLines.size());
      return;
    }

    if(newLines.isEmpty()) {
      commitFileChange.setLinesAdded(0);
      commitFileChange.setLinesChanged(0);
      commitFileChange.setLinesDeleted(oldLines.size());
      return;
    }

    Patch<String> patch = DiffUtils.diff(oldLines, newLines);
    int changed = 0, deleted = 0, added = 0;
    for(AbstractDelta<String> delta : patch.getDeltas()) {
      switch (delta.getType()) {
        case CHANGE:
          changed += delta.getTarget().size();
          break;
        case DELETE:
          deleted += delta.getSource().size();
          break;
        case INSERT:
          added += delta.getTarget().size();
          break;
        case EQUAL:
          break;
      }
    }

    commitFileChange.setLinesAdded(added);
    commitFileChange.setLinesChanged(changed);
    commitFileChange.setLinesDeleted(deleted);
  }

  private void addSingleHunk(FileHeader fileHeader, FileEditType type, Commit commit, File file) {
    EditList editList = fileHeader.toEditList();
    if (editList.isEmpty()) {
      // this is a BINARY file type
      return;
    } else if (editList.size() > 1) {
      throw new IllegalStateException("editList.size() > 1");
    }

    Edit edit = editList.get(0);

    int begin = edit.getBeginB();
    int end = edit.getEndB();
    if (type == FileEditType.DELETE) {
      begin = edit.getBeginA();
      end = edit.getEndA();
    }

    FileHunk fileHunk = new FileHunk();
    fileHunk.setLineCount(end);
    fileHunk.setStartLine(begin);
    fileHunk.setCommit(commit);
    fileHunk.setFile(file);
    commit.getFileHunks().add(fileHunk);
    sourceIndexData.put(fileHunk);

    FileEdit fileEdit = new FileEdit();
    fileEdit.setType(type);
    fileEdit.setBeginA(edit.getBeginA());
    fileEdit.setEndA(edit.getEndA());
    fileEdit.setBeginB(edit.getBeginB());
    fileEdit.setEndB(edit.getEndB());
    fileEdit.setFileHunk(fileHunk);
    fileHunk.getFileEdits().add(fileEdit);
    sourceIndexData.put(fileEdit);
  }

  private void addHunks(List<? extends HunkHeader> hunks, Commit commit, File file) {
    for (HunkHeader hunk : hunks) {
      FileHunk fileHunk = new FileHunk();
      fileHunk.setLineCount(hunk.getNewLineCount());
      fileHunk.setStartLine(hunk.getNewStartLine());
      fileHunk.setCommit(commit);
      fileHunk.setFile(file);
      commit.getFileHunks().add(fileHunk);
      sourceIndexData.put(fileHunk);

      for (Edit edit : hunk.toEditList()) {
        FileEdit fileEdit = new FileEdit();
        fileEdit.setType(map(edit.getType()));
        fileEdit.setBeginA(edit.getBeginA());
        fileEdit.setEndA(edit.getEndA());
        fileEdit.setBeginB(edit.getBeginB());
        fileEdit.setEndB(edit.getEndB());
        fileEdit.setFileHunk(fileHunk);
        fileHunk.getFileEdits().add(fileEdit);
        sourceIndexData.put(fileEdit);
      }
    }
  }

  private FileEditType map(org.eclipse.jgit.diff.Edit.Type type) {
    switch (type) {
      case INSERT:
        return FileEditType.INSERT;
      case DELETE:
        return FileEditType.DELETE;
      case REPLACE:
        return FileEditType.REPLACE;
      case EMPTY:
        return FileEditType.DELETE;
    }

    return FileEditType.DELETE;
  }

  private CommitFileChange addedBlob(Commit commit, Commit commitParent, String path) {
    File file = put(path);
    return addedBlob(commit, commitParent, file);
  }

  private CommitFileChange addedBlob(Commit commit, Commit commitParent, File file) {
    return extractCommitFileChange(commit, commitParent, file, FileChangeType.CREATED);
  }

  private CommitFileChange deletedBlob(Commit commit, Commit commitParent, String path) {
    File file = put(path);
    return extractCommitFileChange(commit, commitParent, file, FileChangeType.DELETED);
  }

  private CommitFileChange modifiedBlob(Commit commit, Commit commitParent, String path) {
    File file = put(path);
    return extractCommitFileChange(commit, commitParent, file, FileChangeType.CHANGED);
  }

  private CommitFileChange renamedBlob(Commit commit, Commit commitParent, String oldPath, String newPath) {
    File oldFile = put(oldPath);
    File newFile = put(newPath);
    return extractRenamedCommitFileChange(commit, commitParent, oldFile, newFile);
  }

  private CommitFileChange copiedBlob(Commit commit, Commit commitParent, String oldPath, String newPath) {
    File oldFile = put(oldPath);
    File newFile = put(newPath);
    return extractCopiedCommitFileChange(commit, commitParent, oldFile, newFile);
  }

  private File put(String path) {
    File file = new File();
    file.setPath(path);
    return sourceIndexData.put(path, file);
  }
}