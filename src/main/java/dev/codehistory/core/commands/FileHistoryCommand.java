package dev.codehistory.core.commands;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.index.sources.GitChangesCompiler;
import dev.codehistory.core.index.sources.data.SourceIndexData;
import dev.codehistory.core.index.sources.data.SourceIndexDataSnapshot;
import dev.codehistory.core.util.external.GitUtilCore;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.revwalk.RevCommit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class FileHistoryCommand implements Callable<FileHistoryResult> {
  private final String repoPath;
  private final String filePath;
  
  private String headHash;
  
  public FileHistoryCommand(String repoPath, String filePath, String headHash) {
    this.repoPath = repoPath;
    this.filePath = filePath;
    this.headHash = headHash;
  }
  
  public FileHistoryCommand(String repoPath, String filePath) {
    this.repoPath = repoPath;
    this.filePath = filePath;
  }
  
  @Override
  public FileHistoryResult call() throws Exception {
    List<RevCommit> fileHistory;
    try (FileRepository repository = new FileRepository(repoPath)) {
      ObjectId id = headHash == null ? repository.resolve(Constants.HEAD) : ObjectId.fromString(headHash);
      fileHistory = GitUtilCore.getFileHistory(repository, id, filePath);
    }
  
    List<Commit> commits = new ArrayList<>(fileHistory.size());
    for (RevCommit revCommit : fileHistory) {
      commits.add(new Commit(revCommit));
    }

    Set<String> filePathFilter = new HashSet<>();
    filePathFilter.add(filePath);

    SourceIndexData data = new SourceIndexData(new SourceIndexDataSnapshot());
    GitChangesCompiler compiler = new GitChangesCompiler(repoPath, data, filePathFilter);
    for (Commit commit : commits) {
      compiler.index(commit);
    }
    
    return new FileHistoryResult(data);
  }
}
