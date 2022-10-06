package src;

import java.util.*;

public abstract class FileSystemPart {
  String name;

  public FileSystemPart(String cName) {
    name = cName;
  }
  public void addComponent(FileSystemPart component)
  throws CompositeException {
    throw new CompositeException(
      "Invalid Operation. Not Supported");
  }
  public FileSystemPart getComponent(int componentNum)
  throws CompositeException {
    throw new CompositeException(
      "Invalid Operation. Not Supported");
  }

  public abstract long getComponentSize();

} // End of class src.FileSystemPart

