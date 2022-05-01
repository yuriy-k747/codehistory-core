package dev.codehistory.core.commands;

import com.google.common.collect.Lists;
import dev.codehistory.core.ExecutionTime;
import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.index.sources.GitChangesCompiler;
import dev.codehistory.core.index.sources.data.SourceIndexData;
import dev.codehistory.core.index.sources.data.SourceIndexDataSnapshot;
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
  private final Set<String> filePathFilter;
  
  private String headHash;
  
  public FilesHistoryCommand(String repoPath, String filePath, String headHash) {
    this.repoPath = repoPath;
    this.headHash = headHash;
    
    this.filePathFilter = new HashSet<>();
    this.filePathFilter.add(filePath);
  }
  
  public FilesHistoryCommand(String repoPath, String filePath) {
    this.repoPath = repoPath;
    
    this.filePathFilter = new HashSet<>();
    this.filePathFilter.add(filePath);
  }
  
  public FilesHistoryCommand(String repoPath, Set<String> filePathFilter) {
    this.repoPath = repoPath;
    this.filePathFilter = filePathFilter;
  }
  
  @Override
  public FilesHistoryResult call() throws Exception {
    List<RevCommit> fileHistory;
    try (FileRepository repository = new FileRepository(repoPath)) {
      ObjectId id = headHash == null ? repository.resolve(Constants.HEAD) : ObjectId.fromString(headHash);
      fileHistory = GitUtilCore.getFilesHistory(repository, id, filePathFilter);
    }
  
    List<Commit> commits = new ArrayList<>(fileHistory.size());
    for (RevCommit revCommit : fileHistory) {
      commits.add(new Commit(revCommit));
    }
  
    final int nThreads = 8;
    List<List<Commit>> batches = Lists.partition(commits, commits.size() / nThreads);
    
    ExecutorService executor = Executors.newFixedThreadPool(nThreads);
    final CompletionService<Object> completionService = new ExecutorCompletionService<>(executor);
  
    SourceIndexData data = new SourceIndexData(new SourceIndexDataSnapshot());
    GitChangesCompiler compiler = new GitChangesCompiler(repoPath, data, filePathFilter);
    final int tasksCount = tasks(completionService, batches, compiler).size();
  
    try {
      for (int i = 0; i < tasksCount; i++) {
        final Future<Object> projectCompleted = completionService.take();
        projectCompleted.get();
      }
    } finally {
      executor.shutdown();
    }
    
    return new FilesHistoryResult(data);
  }
  
  private Collection<Future<Object>> tasks(CompletionService<Object> completionService, List<List<Commit>> batches, GitChangesCompiler compiler) {
    final Collection<Future<Object>> tasks = new ArrayList<>();
    for (List<Commit> batch : batches) {
      tasks.add(completionService.submit(() -> {
        for (Commit commit : batch) {
          compiler.index(commit);
        }
        return true;
      }));
    }
    
    return tasks;
  }
}