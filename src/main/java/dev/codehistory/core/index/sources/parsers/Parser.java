package dev.codehistory.core.index.sources.parsers;

import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.parsers.errors.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class Parser {
  protected final String path;
  protected final LocalSourceIndexData sourceIndexData;
  protected final ArrayList<SyntaxCodeHistoryError> syntaxErrors = new ArrayList<>();
  protected final ArrayList<AmbiguityCodeHistoryError> ambiguityErrors = new ArrayList<>();
  protected final ArrayList<AttemptingFullContextCodeHistoryError> attemptingFullContextErrors = new ArrayList<>();
  protected final ArrayList<ContextSensitivityCodeHistoryError> contextSensitivityErrors = new ArrayList<>();
  protected final ArrayList<CodeHistoryError> criticalErrors = new ArrayList<>();

  protected Parser(String path, LocalSourceIndexData sourceIndexData) {
    this.path = path;
    this.sourceIndexData = sourceIndexData;
  }

  public abstract void parse(InputStream inputStream) throws IOException;

  public abstract void compileCriticalErrors();

  public LocalSourceIndexData getData() {
    return sourceIndexData;
  }

  public String getPath() {
    return path;
  }

  public List<CodeHistoryError> getCriticalErrors() {
    return criticalErrors;
  }
}
