package dev.codehistory.core.commands;

import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.index.sources.GitChangesCompiler;
import dev.codehistory.core.index.sources.data.SourceIndexData;
import dev.codehistory.core.index.sources.data.SourceIndexDataSnapshot;
import dev.codehistory.core.util.external.GitFilesHistory;
import dev.codehistory.core.util.external.GitFilesHistoryResult;
import dev.codehistory.core.util.external.GitUtilCore;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.revwalk.RevCommit;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class FilesHistoryCommand implements Callable<FilesHistoryResult> {
  private final String repoPath;
  private final Set<String> filesPathFilter;
  private final ObjectId headHash;
  private final String branch;
  
  public FilesHistoryCommand(String repoPath, String filePath, String headHash, String branch) {
    this.repoPath = repoPath;
    this.headHash = ObjectId.fromString(headHash);
    this.branch = branch;
  
    this.filesPathFilter = new HashSet<>();
    this.filesPathFilter.add(filePath);
  }
  
  public FilesHistoryCommand(String repoPath, Set<String> filesPathFilter, String branch) throws IOException {
    this.repoPath = repoPath;
    this.branch = branch;
    try (FileRepository repository = new FileRepository(repoPath)) {
      this.headHash = repository.resolve(Constants.HEAD);
    }
    
    this.filesPathFilter = filesPathFilter;
  }
  
  public FilesHistoryCommand(String repoPath, Set<String> filesPathFilter) throws IOException {
    this.repoPath = repoPath;
    try (FileRepository repository = new FileRepository(repoPath)) {
      this.headHash = repository.resolve(Constants.HEAD);
      this.branch = repository.getFullBranch();
    }
    
    this.filesPathFilter = filesPathFilter;
  }
  
  @Override
  public FilesHistoryResult call() throws Exception {
    GitFilesHistoryResult filesHistory;
    try (FileRepository repository = new FileRepository(repoPath)) {
      filesHistory = GitUtilCore.getFilesHistory(repository, headHash, filesPathFilter);
      Set<RevCommit> branchCommits = GitUtilCore.getCommitsInBranch(repository, branch);
      filesHistory.getFilesHistory().forEach((s, gitFilesHistory) -> {
        gitFilesHistory.getCommits().retainAll(branchCommits);
      });
    }
    
    Collection<GitFilesHistory> batches = filesHistory.getFilesHistory().values();
    
    ExecutorService executor = Executors.newFixedThreadPool(batches.size());
    final CompletionService<Object> completionService = new ExecutorCompletionService<>(executor);
    SourceIndexData data = new SourceIndexData(new SourceIndexDataSnapshot());
    final int tasksCount = tasks(completionService, batches, data).size();
  
    try {
      for (int i = 0; i < tasksCount; i++) {
        final Future<Object> projectCompleted = completionService.take();
        projectCompleted.get();
      }
    } finally {
      executor.shutdown();
    }
    
    return new FilesHistoryResult(data, filesHistory);
  }
  
  private Collection<Future<Object>> tasks(CompletionService<Object> completionService, Collection<GitFilesHistory> batches, SourceIndexData data) {
    final Collection<Future<Object>> tasks = new ArrayList<>();
    for (GitFilesHistory batch : batches) {
      tasks.add(completionService.submit(() -> {
        GitChangesCompiler compiler = new GitChangesCompiler(repoPath, data, batch.getRenames());
        for (RevCommit revCommit : batch.getCommits()) {
          Commit commit = new Commit(revCommit);
          compiler.index(commit);
        }
        return true;
      }));
    }
    
    return tasks;
  }
}