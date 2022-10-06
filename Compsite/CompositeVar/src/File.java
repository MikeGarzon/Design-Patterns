package src;

import java.util.*;

public class File extends FileSystemPart {
  private long size;

  public File(String cName, long sz) {
    super(cName);
    size = sz;
  }

  public long getComponentSize() {
    return size;
  }

} // End of class

