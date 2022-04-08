package dev.codehistory.core.util;

public class StringUtils {

  private StringUtils() {
    throw new IllegalStateException("StringUtils is utils");
  }

  public static String getShort(String value, int maxLength) {
    if(value.length() <= maxLength) {
      return value;
    }
    
    return value.substring(0, maxLength) + "...";
  }
  
  public static String getShortLeft(String value, int maxLength) {
    if(value.length() <= maxLength) {
      return value;
    }
    
    return "..." + value.substring(value.length() - maxLength);
  }
}
