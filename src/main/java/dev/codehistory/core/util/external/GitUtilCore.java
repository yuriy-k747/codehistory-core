package dev.codehistory.core.util.external;

import com.github.difflib.UnifiedDiffUtils;
import com.github.difflib.patch.Patch;
import org.antlr.v4.runtime.misc.Pair;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.input.BOMInputStream;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.LsRemoteCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.diff.DiffConfig;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.*;
import org.eclipse.jgit.revwalk.*;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.OrTreeFilter;
import org.eclipse.jgit.treewalk.filter.TreeFilter;

import java.io.*;
import java.util.*;

public class GitUtilCore {

  private GitUtilCore() {
    throw new IllegalStateException("GitUtilCore is utils");
  }

  public static GitFilesHistoryResult getFileHistory(String repoPath, String filePath) throws IOException {
    try (FileRepository repository = new FileRepository(repoPath)) {
      return getFileHistory(repository, repository.resolve(Constants.HEAD), filePath);
    }
  }
  
  public static GitFilesHistoryResult getFilesHistory(FileRepository repository, AnyObjectId id, Collection<String> filePaths) throws IOException {
    DiffConfig diffConfig = repository.getConfig().get(DiffConfig.KEY);
    
    List<TreeFilter> followFilters = new ArrayList<>(filePaths.size());
    List<GitFileHistoryRenameCallback> renameCallbacks = new ArrayList<>();
    for (String filePath : filePaths) {
      FollowFilter followFilter = FollowFilter.create(filePath, diffConfig);
      GitFileHistoryRenameCallback renameCallback = new GitFileHistoryRenameCallback(filePath);
      renameCallbacks.add(renameCallback);
      followFilter.setRenameCallback(renameCallback);
      followFilters.add(followFilter);
    }
  
    // Set<RevCommit> revCommits = walkWithOrTreeFilter(repository, id, followFilters); // not working for follow filter combined with or
    Set<RevCommit> revCommits = walkForEachFiter(repository, id, followFilters);
  
    GitFilesHistoryResult res = new GitFilesHistoryResult(revCommits);
    for (GitFileHistoryRenameCallback renameCallback : renameCallbacks) {
      res.getFilePathsWithRenames().put(renameCallback.getRootPath(), renameCallback.getRenames());
    }
    
    return res;
  }
  
  // inefficient
  private static Set<RevCommit> walkForEachFiter(FileRepository repository, AnyObjectId id, List<TreeFilter> filters) throws IOException {
    Set<RevCommit> revCommits = new HashSet<>();
  
    for (TreeFilter filter : filters) {
      RevWalk revWalk = new RevWalk(repository);
      revWalk.setTreeFilter(filter);
  
      RevCommit rootCommit = revWalk.parseCommit(id);
      revWalk.sort(RevSort.COMMIT_TIME_DESC);
      revWalk.markStart(rootCommit);
  
      for (RevCommit revCommit : revWalk) {
        revCommits.add(revCommit);
      }
    }
  
    return revCommits;
  }
  
  // OrTreeFilter.create combined with FollowFilter doesn't work as expected
  private static Set<RevCommit> walkWithOrTreeFilter(FileRepository repository, AnyObjectId id, List<TreeFilter> followFilters) throws IOException {
    Set<RevCommit> revCommits = new HashSet<>();
    
    TreeFilter filter = followFilters.size() > 1 ? OrTreeFilter.create(followFilters) : followFilters.get(0);
  
    RevWalk revWalk = new RevWalk(repository);
    revWalk.setTreeFilter(filter);
  
    RevCommit rootCommit = revWalk.parseCommit(id);
    revWalk.sort(RevSort.COMMIT_TIME_DESC);
    revWalk.markStart(rootCommit);
  
    for (RevCommit revCommit : revWalk) {
      revCommits.add(revCommit);
    }
    
    return revCommits;
  }
  
  public static GitFilesHistoryResult getFileHistory(FileRepository repository, AnyObjectId id, String filePath) throws IOException {
    return getFilesHistory(repository, id, List.of(filePath));
  }
  
  public static CanonicalTreeParser createTreeParser(AnyObjectId anyObjectId, ObjectReader objectReader) throws IOException {
    CanonicalTreeParser parser = new CanonicalTreeParser();
    parser.reset(objectReader, anyObjectId);
    return parser;
  }

  public static RevCommit getRoot(FileRepository repository) throws IOException {
    try (RevWalk walk = new RevWalk(repository)) {
      AnyObjectId headId = repository.resolve(Constants.HEAD);
      RevCommit root = walk.parseCommit(headId);
      walk.sort(RevSort.REVERSE);
      walk.markStart(root);

      return walk.next();
    }
  }

  public static RevCommit getParent(Repository repository, RevCommit revCommit) throws IOException {
    if(revCommit.getParentCount() == 0) {
      return null;
    }

    RevCommit parent = revCommit.getParent(0);
    if(parent == null) {
      return null;
    } else {
      return repository.parseCommit(parent);
    }
  }

  public static Set<RevCommit> getCommitsInBranch(Repository repository, String ref) throws IOException, GitAPIException {
    Set<RevCommit> res = new HashSet<>();

    try (Git git = new Git(repository)) {
      LogCommand logCommand = git.log().add(repository.resolve(ref));
      Iterable<RevCommit> logCommandRes= logCommand.call();
      for (RevCommit revCommit : logCommandRes) {
        res.add(revCommit);
      }
    }
    
    return res;
  }
  
  

  public static boolean isReacheable(Repository repository, ObjectId child, ObjectId probingParent) throws IOException {
    try (RevWalk walk = new RevWalk(repository)) {
      RevCommit childCommit = repository.parseCommit(child);
      walk.markStart(childCommit);
      for (RevCommit rev : walk) {
        if(rev.getId().equals(probingParent)) {
          return true;
        }
      }
    }

    return false;
  }
  
  public static Pair<Boolean, List<ObjectId>> getReacheablePath(Repository repository, ObjectId child, ObjectId probingParent) throws IOException {
    List<ObjectId> path = new ArrayList<>();
    try (RevWalk walk = new RevWalk(repository)) {
      RevCommit childCommit = repository.parseCommit(child);
      walk.markStart(childCommit);
      for (RevCommit rev : walk) {
        if(rev.getId().equals(probingParent)) {
          return new Pair<>(true, path);
        }
        
        if(!rev.getId().equals(child)) {
          path.add(rev.getId());
        }
      }
    }
    
    return new Pair<>(false, new ArrayList<>());
  }

  public static ObjectId findFile(Repository repository, RevCommit commit, String filePath) throws IOException {
    ObjectId treeId = commit.getTree();

    try (TreeWalk treeWalk = new TreeWalk(repository)) {
      treeWalk.reset(treeId);
      while (treeWalk.next()) {
        if (treeWalk.isSubtree()) {
          treeWalk.enterSubtree();
        } else {
          String path = treeWalk.getPathString();
          if (path.equals(filePath)) {
            return treeWalk.getObjectId(0);
          }
        }
      }
    }

    throw new IllegalStateException("Not found");
  }

  public static List<String> loadList(Repository repository, ObjectId id) throws IOException {
    ObjectLoader loader = repository.open(id, Constants.OBJ_BLOB);
    try (InputStream inputStream = loader.openStream()) {
      try (BOMInputStream bomInputStream = new BOMInputStream(inputStream)) {
        ByteOrderMark bom = bomInputStream.getBOM();
        String charsetName = bom == null ? "UTF-8" : bom.getCharsetName();
        try (InputStreamReader reader = new InputStreamReader(new BufferedInputStream(bomInputStream), charsetName)) {
          LineIterator it = IOUtils.lineIterator(reader);
          ArrayList<String> res = new ArrayList<>();
          while (it.hasNext()) {
            String line = it.nextLine();
            res.add(line);
          }

          return res;
        }
      }
    }
  }
  
  public static String toUnifiedDiff(
      String name,
      List<String> originalLines,
      Patch<String> patch,
      int contextSize) {
    List<String> res = UnifiedDiffUtils.generateUnifiedDiff(name, name, originalLines, patch, contextSize);
    StringBuilder builder = new StringBuilder();
    for (String delta : res) {
      builder.append(delta).append('\n');
    }
    
    return builder.toString();
  }
  
  public static void dumpByObjectId(FileRepository repository, ObjectId objectId, String path) throws IOException {
    ObjectLoader loader = repository.open(objectId, Constants.OBJ_BLOB);
    try (InputStream stream = loader.openStream()) {
      FileUtils.copyInputStreamToFile(stream, new File(path));
    }
  }
  
  public static Collection<Ref> listRemoteReferences(String remote, CredentialsProvider credentialsProvider) throws GitAPIException {
    LsRemoteCommand lsRemoteRepository = Git.lsRemoteRepository();
    lsRemoteRepository.setRemote(remote);
    
    if(credentialsProvider != null) {
      lsRemoteRepository.setCredentialsProvider(credentialsProvider);
    }
    
    return lsRemoteRepository.call();
  }
  
  public static void clone(String remote, File directory, CredentialsProvider credentialsProvider) throws GitAPIException {
    CloneCommand cloneCommand = Git.cloneRepository();
    cloneCommand.setURI(remote);
    cloneCommand.setDirectory(directory);
    
    if(credentialsProvider != null) {
      cloneCommand.setCredentialsProvider(credentialsProvider);
    }
    
    cloneCommand.call();
  }
  
  public static String getRemoteUrl(String repoPath) throws IOException {
    try (FileRepository repository = new FileRepository(repoPath)) {
      return repository.getConfig().getString("remote", "origin", "url");
    }
  }
  
  public static String translateUrl(String remoteUrl) {
    // gitlab scheme
    if(remoteUrl.startsWith("[") && remoteUrl.endsWith(".git")) {
      int lastHost = remoteUrl.indexOf("]:");
      if(lastHost != -1) {
        String host = remoteUrl.substring(1, lastHost);
        String path = remoteUrl.substring(lastHost + 2);
        return String.format("ssh://%s/%s", host, path);
      }
    }
    
    return remoteUrl;
  }
  
  
}
