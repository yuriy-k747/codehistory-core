package dev.codehistory.core.util;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Scanner;

public class ReadWriteUtils {

  private ReadWriteUtils() {
    throw new IllegalStateException("ReadWriteUtils is utils");
  }

  public static String readResources(String name) {
    InputStream inputStream = CommonUtil.class.getClassLoader().getResourceAsStream(name);

    String text = null;
    assert inputStream != null;
    try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
      text = scanner.useDelimiter("\\A").next();
    }

    return text;
  }

  public static String readFile(String path) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, StandardCharsets.UTF_8);
  }

  public static boolean fileExists(String path) {
    File f = new File(path);

    return f.exists() && !f.isDirectory();
  }

  public static void write(String path, Collection<String> list) throws FileNotFoundException, UnsupportedEncodingException {
    PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8.name());
    for(String val : list) {
      writer.println(val);
    }
    writer.close();
  }

  public static void write(String path, String content) throws FileNotFoundException, UnsupportedEncodingException {
    PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8.name());
    writer.write(content);
    writer.close();
  }

  public static void write(String path, byte[] bytes) throws IOException {
    try (FileOutputStream stream = new FileOutputStream(path)) {
      stream.write(bytes);
    }
  }

  public static void write(String path, InputStream inputStream) throws IOException {
    String content = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
    write(path, content);
  }

  public static  <T> void write(Collection<T> obj, ObjectOutputStream stream) throws IOException {
    for(T item : obj) {
      stream.writeObject(item);
    }
  }
}
