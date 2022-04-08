package dev.codehistory.core.entities.sources;

import dev.codehistory.core.entities.IdEntity;

public class SourcePart extends IdEntity {
  public static final String Identifier = "identifier";
  private String identifier;
  private String sanitizedIdentifier;
  private SourceState sourceState = new SourceState();

  public String getIdentifier() {
    return identifier;
  }

  public String getShortIdentifier(int maxLength) {
    if(identifier.length() <= maxLength) {
      return identifier;
    }

    return identifier.substring(0, maxLength) + "...";
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
    this.sanitizedIdentifier = identifier.replaceAll("\\s+","");
}

  public SourceState getSourceState() {
    return sourceState;
  }

  public void setSourceState(SourceState sourceState) {
    this.sourceState = sourceState;
  }
  
  public String getSanitizedIdentifier() {
    return sanitizedIdentifier;
  }
  
  public void setSanitizedIdentifier(String sanitizedIdentifier) {
    this.sanitizedIdentifier = sanitizedIdentifier;
  }
}
