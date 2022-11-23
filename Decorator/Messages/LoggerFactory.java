import java.util.*;
import java.io.*;

public class LoggerFactory {

  public boolean isFileLoggingEnabled() {
    Properties p = new Properties();
    try {
      p.load(ClassLoader.getSystemResourceAsStream(
        "Logger.properties"));
      String fileLoggingValue =
        p.getProperty("FileLogging");
      if (fileLoggingValue.equalsIgnoreCase("ON") == true)
        return true;
      else
        return false;
    } catch (IOException e) {
      return false;
    }
  }

  public Logger getLogger() {
    if (isFileLoggingEnabled()) {
      return FileLogger.getFileLogger();
    } else {
      return new ConsoleLogger();
    }
  }

}
