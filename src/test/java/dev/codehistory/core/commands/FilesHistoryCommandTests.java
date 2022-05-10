package dev.codehistory.core.commands;

import dev.codehistory.core.entities.sources.ModuleUnitChange;
import dev.codehistory.core.entities.sources.ModuleUnitMemberChange;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilesHistoryCommandTests {
  
  @Ignore("Requires PDFBOX repository")
  @Test
  public void testMultipleInput() throws Exception {
    String repoPath = System.getenv("CODEHISTORY_TESTS_PDFBOX_REPO_PATH");
    
    Set<String> paths = new HashSet<>();
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/cos/COSArray.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/cos/COSDictionary.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/ContentStreamWriter.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/XrefTrailerResolver.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/XMLUtil.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFObjectStreamParser.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/filter/CCITTFaxDecoderStream.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFStreamParser.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFXrefStreamParser.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/filter/ASCII85OutputStream.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/Matrix.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/NumberFormatUtil.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/filter/CCITTFaxEncoderStream.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFParser.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/filter/FlateFilter.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/filter/CryptFilter.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/Version.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/text/TextPositionComparator.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/DateConverter.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/SmallMap.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/EndstreamFilterStream.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/text/LegacyPDFStreamEngine.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/printing/Orientation.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSStandardOutputStream.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/IterativeMergeSort.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/Loader.java");
    
    FilesHistoryCommand command = new FilesHistoryCommand(repoPath, paths);
    FilesHistoryResult res = command.call();
    
    Map<String, List<ModuleUnitChange>> unitChanges = res.getUnitChanges();
    Map<String, List<ModuleUnitMemberChange>> memberChanges = res.getMemberChanges();
  }
  
  @Ignore("Requires PDFBOX repository")
  @Test
  public void testSingleXMLUtil() throws Exception {
    String repoPath = System.getenv("CODEHISTORY_TESTS_PDFBOX_REPO_PATH");
    
    Set<String> paths = new HashSet<>();
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/XMLUtil.java");
    
    FilesHistoryCommand command = new FilesHistoryCommand(repoPath, paths);
    FilesHistoryResult res = command.call();
    Map<String, List<ModuleUnitChange>> unitChanges = res.getUnitChanges();
    Map<String, List<ModuleUnitMemberChange>> memberChanges = res.getMemberChanges();
  }
  
  @Ignore("Requires PDFBOX repository")
  @Test
  public void testTwoFiles() throws Exception {
    String repoPath = System.getenv("CODEHISTORY_TESTS_PDFBOX_REPO_PATH");
    
    Set<String> paths = new HashSet<>();
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/util/XMLUtil.java");
    paths.add("pdfbox/src/main/java/org/apache/pdfbox/cos/COSArray.java");
    
    FilesHistoryCommand command = new FilesHistoryCommand(repoPath, paths);
    FilesHistoryResult res = command.call();
    Map<String, List<ModuleUnitChange>> unitChanges = res.getUnitChanges();
    Map<String, List<ModuleUnitMemberChange>> memberChanges = res.getMemberChanges();
  }
}