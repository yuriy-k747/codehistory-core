package dev.codehistory.core.util;

import org.apache.commons.io.FilenameUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

public class KnownNonBinaryExtensions {

  private KnownNonBinaryExtensions() {
    throw new IllegalStateException("KnownNonBinaryExtensions cannot be instantiated");
  }

  private static final HashSet<String> knownNonBinaryExtensions = new HashSet<>();
  static  {
    knownNonBinaryExtensions.add("csproj");
    knownNonBinaryExtensions.add("resx");
    knownNonBinaryExtensions.add("props");
    knownNonBinaryExtensions.add("config");
    knownNonBinaryExtensions.add("json");
    knownNonBinaryExtensions.add("xml");
    knownNonBinaryExtensions.add("xsd");
    knownNonBinaryExtensions.add("modelproj");
    knownNonBinaryExtensions.add("dgml");
  }

  public static boolean isBinary(String path) {
    Path fileName = Paths.get(path).getFileName();
    if(fileName.startsWith(".")) {
      return false;
    }

    String extensions = FilenameUtils.getExtension(path);
    return knownNonBinaryExtensions.contains(extensions);
  }
}
