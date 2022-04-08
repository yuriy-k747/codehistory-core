package dev.codehistory.core.entities.sources;

public class SourceState {
  private String definition;
  private String sha1;
  private Integer startLine;
  private Integer startPos;
  private Integer definitioneEdLine;
  private Integer definitioneEdPos;
  private Integer endLine;
  private Integer endPos;

  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public Integer getStartLine() {
    return startLine;
  }

  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }

  public Integer getStartPos() {
    return startPos;
  }

  public void setStartPos(Integer startPos) {
    this.startPos = startPos;
  }

  public Integer getEndLine() {
    return endLine;
  }

  public void setEndLine(Integer endLine) {
    this.endLine = endLine;
  }

  public Integer getEndPos() {
    return endPos;
  }

  public void setEndPos(Integer endPos) {
    this.endPos = endPos;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  @Override
  public String toString() {
    return String.format("%s: start {ln: %d, col: %d}, end {ln: %d, col: %d}",
        getSha1(), getStartLine(), getStartPos(), getEndLine(), getEndPos());
  }

  public Integer getDefinitioneEndLine() {
    return definitioneEdLine;
  }

  public void setDefinitioneEdLine(Integer definitioneEdLine) {
    this.definitioneEdLine = definitioneEdLine;
  }

  public Integer getDefinitioneEndPos() {
    return definitioneEdPos;
  }

  public void setDefinitioneEdPos(Integer definitioneEdPos) {
    this.definitioneEdPos = definitioneEdPos;
  }
}
