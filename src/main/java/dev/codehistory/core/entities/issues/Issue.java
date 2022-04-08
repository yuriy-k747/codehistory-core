package dev.codehistory.core.entities.issues;

import dev.codehistory.core.entities.IdEntity;
import dev.codehistory.core.entities.Outdateable;
import dev.codehistory.core.entities.git.Commit;
import dev.codehistory.core.util.CustomFormatUtils;
import dev.codehistory.core.util.TimestampFormatter;
import dev.codehistory.core.util.external.ExternalLinks;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Issue extends IdEntity implements Serializable, Outdateable {
  private transient String issueKey;
  private transient Integer externalId;
  private transient Integer projectExternalId;
  private transient Collection<Commit> commits = new HashSet<>();
  private final HashSet<Long> commitIds = new HashSet<>();
  private transient Long reporterId;
  private IssueUser reporter;
  private transient Long assigneeId;
  private IssueUser assignee;
  private transient String type;
  private transient String subject;
  private transient String priority;
  private transient String status;
  private transient Integer timeSpent = 0;
  private transient Timestamp created;
  private transient Timestamp updated;
  private transient Timestamp lastUpdate;
  private int commitsCount;
  
  // timeSpentAsDuration
  public IssueDuration getTimeSpentAsDuration() {
    return calcDuration(timeSpent / 60);
  }
  
  public String getTimeSpentDateRange() {
    Duration duration =  Duration.ofSeconds(timeSpent);

    return CustomFormatUtils.formatDuration(duration);
  }
  
  public IssueDuration calcDuration(int minutes) {
    if(minutes <= 60) {
      return IssueDuration.DURATION1;
    } else if(minutes <= 180){
      return IssueDuration.DURATION2;
    }  else if(minutes <= 360){
      return IssueDuration.DURATION3;
    } else if(minutes <= 720){
      return IssueDuration.DURATION4;
    } else if(minutes <= 1080){
      return IssueDuration.DURATION5;
    } else if(minutes <= 1440){
      return IssueDuration.DURATION6;
    } else if(minutes <= 2880){
      return IssueDuration.DURATION7;
    } else if(minutes <= 5760){
      return IssueDuration.DURATION8;
    } else if(minutes <= 11520){
      return IssueDuration.DURATION9;
    } else if(minutes <= 23040){
      return IssueDuration.DURATION10;
    } else if(minutes <= 46080){
      return IssueDuration.DURATION11;
    } else if(minutes <= 92160){
      return IssueDuration.DURATION12;
    } else if(minutes <= 184320){
      return IssueDuration.DURATION13;
    } else if(minutes <= 368640){
      return IssueDuration.DURATION14;
    }
    
    return IssueDuration.DURATION15;
  }
  
  public String getIssueKey() {
    return issueKey;
  }

  public void setIssueKey(String issueKey) {
    this.issueKey = issueKey;
  }

  public String getExternalLink() {
    return ExternalLinks.INSTANCE.formatIssueLink(getIssueKey());
  }
  
  public String getShortCreated() {
    if(getCreated() == null) {
      return null;
    }

    return new TimestampFormatter().asShortFormat(getCreated());
  }

  public String getLongCreated() {
    if(getCreated() == null) {
      return null;
    }

    return new TimestampFormatter().asLongFormat(getCreated());
  }

  public String getShortUpdated() {
    if(getUpdated() == null) {
      return null;
    }

    return new TimestampFormatter().asShortFormat(getUpdated());
  }

  public String getLongUpdated() {
    if(getUpdated() == null) {
      return null;
    }

    return new TimestampFormatter().asLongFormat(getUpdated());
  }

  public Collection<Commit> getCommits() {
    return commits;
  }

  public void setCommits(Collection<Commit> commits) {
    this.commits = commits;
  }

  @Override
  public String toString() {
    return issueKey;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(Integer timeSpent) {
    this.timeSpent = timeSpent;
  }

  public Long getReporterId() {
    return reporterId;
  }

  public void setReporterId(Long reporter) {
    this.reporterId = reporter;
  }

  public Integer getExternalId() {
    return externalId;
  }

  public boolean hasExternalIdSet() {
    return externalId != null && externalId != 0;
  }

  public void setExternalId(Integer externalId) {
    this.externalId = externalId;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 23 * result + getIssueKey().hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Issue)) {
      return false;
    }

    Issue wrapper = (Issue) obj;
    return wrapper.getIssueKey().equals(getIssueKey());
  }

  @Override
  public Timestamp getLastUpdate() {
    return lastUpdate;
  }

  @Override
  public void setLastUpdate(Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Integer getProjectExternalId() {
    return projectExternalId;
  }

  public void setProjectExternalId(Integer projectExternalId) {
    this.projectExternalId = projectExternalId;
  }

  public Long getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Long assigneeId) {
    this.assigneeId = assigneeId;
  }

  public IssueUser getReporter() {
    return reporter;
  }

  public void setReporter(IssueUser reporter) {
    this.reporter = reporter;
    this.reporterId = reporter.getId();
  }

  public IssueUser getAssignee() {
    return assignee;
  }

  public void setAssignee(IssueUser assignee) {
    this.assignee = assignee;
    this.assigneeId = assignee.getId();
  }

  public Timestamp getCreated() {
    return created;
  }

  public void setCreated(Timestamp created) {
    this.created = created;
  }

  public Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(Timestamp updated) {
    this.updated = updated;
  }
  
  public Set<Long> getCommitIds() {
    return commitIds;
  }
  
  public int getCommitsCount() {
    return commitsCount;
  }
  
  public void setCommitsCount(int commitsCount) {
    this.commitsCount = commitsCount;
  }
}
