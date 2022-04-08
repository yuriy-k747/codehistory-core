package dev.codehistory.core.util.external;

public class ExternalLinks {
  public static final ExternalLinks INSTANCE = new ExternalLinks();
  
  private IssueExternalLinkFormatter issueLinkFormatter;
  private CommitExternalLinkFormatter commitExternalLinkFormatter;
  
  public void init(IssueExternalLinkFormatter formatter) {
    this.issueLinkFormatter = formatter;
  }
  
  public void init(CommitExternalLinkFormatter formatter) {
    this.commitExternalLinkFormatter = formatter;
  }
  
  public String formatIssueLink(String issueKey)  {
    return issueLinkFormatter.format(issueKey);
  }
  
  public String formatCommitLink(String sha1)  {
    return commitExternalLinkFormatter.format(sha1);
  }
}
