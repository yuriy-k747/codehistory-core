package dev.codehistory.core.commands;

import com.google.common.collect.Lists;
import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.index.sources.GitChangesCompiler;
import dev.codehistory.core.index.sources.data.SourceIndexData;
import dev.codehistory.core.index.sources.data.SourceIndexDataSnapshot;
import dev.codehistory.core.util.external.GitFilesHistoryResult;
import dev.codehistory.core.util.external.GitUtilCore;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.revwalk.RevCommit;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

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
      filesHistory.getCommits().retainAll(branchCommits);
    }
    
    List<Commit> commits = new ArrayList<>(filesHistory.getCommits().size());
    for (RevCommit revCommit : filesHistory.getCommits()) {
      commits.add(new Commit(revCommit));
    }
    
    final int nThreads = 8;
    final int minSize = 25;
    int batchSize = commits.size() < minSize ? minSize : commits.size() / nThreads;
    List<List<Commit>> batches = Lists.partition(commits, batchSize);
    
    ExecutorService executor = Executors.newFixedThreadPool(nThreads);
    final CompletionService<Object> completionService = new ExecutorCompletionService<>(executor);
  
    SourceIndexData data = new SourceIndexData(new SourceIndexDataSnapshot());
    GitChangesCompiler compiler = new GitChangesCompiler(repoPath, data, filesHistory.getAllFilePaths());
    final int tasksCount = tasks(completionService, batches, compiler).size();
  
    try {
      for (int i = 0; i < tasksCount; i++) {
        final Future<Object> projectCompleted = completionService.take();
        projectCompleted.get();
      }
    } finally {
      executor.shutdown();
    }
    
    return new FilesHistoryResult(data, filesHistory.getFilePathsWithRenames());
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