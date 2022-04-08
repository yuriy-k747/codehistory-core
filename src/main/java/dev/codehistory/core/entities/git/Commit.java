package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.entities.git.pairs.CommitIssue;
import dev.codehistory.core.entities.issues.Issue;
import dev.codehistory.core.entities.sources.ChangeStats;
import dev.codehistory.core.util.StringUtils;
import dev.codehistory.core.util.TimestampFormatter;
import dev.codehistory.core.util.external.ExternalLinks;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.revwalk.RevCommit;
import org.ocpsoft.prettytime.PrettyTime;

import java.sql.Timestamp;
import java.util.*;

public class Commit extends IdEntity {
    private Timestamp created;
    private ObjectId objectId;
    private String shortMessage;
    private GitAuthor author;
    private GitAuthor committer;
    private Integer parentCount;
    private Long authorId;
    private Long commiterId;
    private Collection<Issue> issues = new HashSet<>();
    private Collection<CommitFileChange> fileChanges = new HashSet<>();
    private List<FileHunk> fileHunks = new ArrayList<>(64);
    private Integer filesCreated = 0;
    private Integer filesChanged = 0;
    private Integer filesRenamed = 0;
    private Integer filesCopied = 0;
    private Integer filesDeleted = 0;
    private ChangeStats linesChangeStats;
    private List<Branch> inBranches = new ArrayList<>();
    private String shortMessageHtml;
    private List<ObjectId> parentIds = new ArrayList<>();
    private List<Commit> duplicates = new ArrayList<>();
    
    public Commit() { }
    
    public Commit(RevCommit revCommit) {
        this.setObjectId(revCommit);
        this.setCreated(new Timestamp(revCommit.getAuthorIdent().getWhen().getTime()));
        this.setShortMessage(revCommit.getShortMessage());
        this.setParentCount(revCommit.getParentCount());
    }
    
    public String getShortestMessage(int maxLength) {
        return StringUtils.getShort(shortMessage, maxLength);
    }
    
    // parentIdsAsSha1
    public List<String> getParentIdsAsSha1() {
        ArrayList<String> res = new ArrayList<>(parentIds.size());
        for (ObjectId parentId : parentIds) {
            res.add(parentId.getName());
        }
        
        return res;
    }
    
    // first3InBranches
    public List<Branch> getFirst3InBranches() {
        List<Branch> res = new ArrayList<>();
        for (int i = 0; i < 3 && i < inBranches.size(); i++) {
            Branch inBranch = inBranches.get(i);
            res.add(inBranch);
        }
        
        return res;
    }
    
    // remainingInBranches
    public List<Branch> getRemainingInBranches() {
        List<Branch> res = new ArrayList<>();
        
        if(inBranches.size() <= 3) {
            return res;
        }
        
        for (int i = 3; i < inBranches.size(); i++) {
            Branch inBranch = inBranches.get(i);
            res.add(inBranch);
        }
    
        return res;
    }
    
    public String getExternalLink() {
        return ExternalLinks.INSTANCE.formatCommitLink(getSha1());
    }
    
    public String getShortCreated() {
        return new TimestampFormatter().asShortFormat(getCreated());
    }

    // longCreated
    public String getLongCreated() {
        return new TimestampFormatter().asLongFormat(getCreated());
    }
    
    // mediumCreated
    public String getMediumCreated() {
        return new TimestampFormatter().asMediumFormat(getCreated());
    }
    
    // readableCreated
    public String getReadableCreated() {
        return new TimestampFormatter().asReadableFormat(getCreated());
    }

    public String getShortSha1() {
        return getObjectId().getName().substring(0, 7);
    }

    public String getSha1() {
        return objectId.getName();
    }

    public Collection<Issue> getIssues() {
        return issues;
    }

    public void setIssues(Collection<Issue> issues) {
        this.issues = issues;
    }

    public GitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(GitAuthor author) {
        this.author = author;
    }

    public Collection<CommitFileChange> getFileChanges() {
        return fileChanges;
    }

    public void setFileChanges(Collection<CommitFileChange> fileChanges) {
        this.fileChanges = fileChanges;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    // prettyTime
    public String getPrettyTime() {
        PrettyTime prettyTime = new PrettyTime(Locale.US);
        return prettyTime.format(created);
    }

    public ObjectId getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectId objectId) {
        this.objectId = objectId;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    @Override
    public String toString() {
        return shortMessage == null ? getId().toString() : getShortMessage();
    }

    public List<CommitIssue> toCommitIssues() {
        List<CommitIssue> commitIssues = new ArrayList<>(getIssues().size());
        Issue[] iss = getIssues().toArray(new Issue[0]);
        for (int i = 0; i < iss.length; i++) {
            commitIssues.add(new CommitIssue(this, iss[i]));
        }

        return commitIssues;
    }

    public List<FileHunk> getFileHunks() {
        return fileHunks;
    }

    public void setFileHunks(List<FileHunk> fileHunks) {
        this.fileHunks = fileHunks;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 23 * result + getObjectId().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Commit)) {
            return false;
        }

        Commit wrapper = (Commit) obj;
        return wrapper.getObjectId().equals(getObjectId());
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Integer getParentCount() {
        return parentCount;
    }

    public void setParentCount(Integer parentCount) {
        this.parentCount = parentCount;
    }

    public Integer getFilesCreated() {
        return filesCreated;
    }

    public void setFilesCreated(Integer filesCreated) {
        this.filesCreated = filesCreated;
    }

    public Integer getFilesChanged() {
        return filesChanged;
    }

    public void setFilesChanged(Integer filesChanged) {
        this.filesChanged = filesChanged;
    }

    public Integer getFilesRenamed() {
        return filesRenamed;
    }

    public void setFilesRenamed(Integer filesRenamed) {
        this.filesRenamed = filesRenamed;
    }

    public Integer getFilesCopied() {
        return filesCopied;
    }

    public void setFilesCopied(Integer filesCopied) {
        this.filesCopied = filesCopied;
    }

    public Integer getFilesDeleted() {
        return filesDeleted;
    }

    public void setFilesDeleted(Integer filesDeleted) {
        this.filesDeleted = filesDeleted;
    }
    
    public List<Branch> getInBranches() {
        return inBranches;
    }
    
    public void setInBranches(List<Branch> inBranches) {
        this.inBranches = inBranches;
    }
    
    public ChangeStats getLinesChangeStats() {
        return linesChangeStats;
    }
    
    public void setLinesChangeStats(ChangeStats linesChangeStats) {
        this.linesChangeStats = linesChangeStats;
    }
    
    public Long getCommiterId() {
        return commiterId;
    }
    
    public void setCommiterId(Long commiterId) {
        this.commiterId = commiterId;
    }
    
    public GitAuthor getCommitter() {
        return committer;
    }
    
    public void setCommitter(GitAuthor committer) {
        this.committer = committer;
    }
    
    // shortMessageHtml
    public String getShortMessageHtml() {
        return shortMessageHtml;
    }
    
    public void setShortMessageHtml(String shortMessageHtml) {
        this.shortMessageHtml = shortMessageHtml;
    }
    
    public List<ObjectId> getParentIds() {
        return parentIds;
    }
    
    public void setParentIds(List<ObjectId> parentIds) {
        this.parentIds = parentIds;
    }
    
    public List<Commit> getDuplicates() {
        return duplicates;
    }
    
    public void setDuplicates(List<Commit> duplicates) {
        this.duplicates = duplicates;
    }
}
