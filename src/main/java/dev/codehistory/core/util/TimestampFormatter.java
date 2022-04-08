package dev.codehistory.core.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimestampFormatter {

  private final SimpleDateFormat shortFormat =  new SimpleDateFormat("MM/dd/yyyy");
  private final SimpleDateFormat longFormat =  new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
  private final SimpleDateFormat mediumFormat =  new SimpleDateFormat("MM/dd/yy HH:mm");
  private final SimpleDateFormat readableFormat =  new SimpleDateFormat("MMM d, yyyy HH:mm");
  
  public String asShortFormat(Timestamp timestamp) {
    return shortFormat.format(timestamp);
  }
  
  public String asLongFormat(Timestamp timestamp) {
    return longFormat.format(timestamp);
  }
  
  public String asMediumFormat(Timestamp timestamp) {
    return mediumFormat.format(timestamp);
  }
  
  public String asReadableFormat(Timestamp timestamp) {
    return readableFormat.format(timestamp);
  }
}
