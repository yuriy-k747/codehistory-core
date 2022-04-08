package dev.codehistory.core.util;

import java.time.Duration;

public class CustomFormatUtils {

  private CustomFormatUtils() {
    throw new IllegalStateException("CompilatorPostProcess is utils");
  }

  public static String formatDuration(Duration duration) {
    long seconds = duration.getSeconds();

    long dayTime = seconds % 86400;
    long absDayTime = Math.abs(dayTime);

    long days = (seconds - dayTime) / 86400;

    StringBuilder builder = new StringBuilder();

    long hours = absDayTime / 3600;
    long minutes = (absDayTime % 3600) / 60;
    long secs = (absDayTime % 60);

    hours += days * 24;

    if(hours > 0) {
      builder.append(String.format("%d hrs ", hours));
    }

    if(minutes > 0) {
      builder.append(String.format("%d min ", minutes));
    }

    if(builder.length() == 0) {
      builder.append(String.format("%ds", secs));
    }

    return seconds < 0 ? "- " + builder.toString() : builder.toString();
  }
}
