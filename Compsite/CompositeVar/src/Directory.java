package src;

import java.util.*;


public class Directory extends FileSystemPart {
  Vector dirContents = new Vector();
  //individual files/sub folders collection

  public Directory(String cName) {
    super(cName);
  }

  public void addComponent(FileSystemPart fc)
  throws CompositeException {
    dirContents.add(fc);
  }

  public FileSystemPart getComponent(int location)
  throws CompositeException {
    return (FileSystemPart) dirContents.elementAt(
             location);
  }

  public long getComponentSize() {
    long sizeOfAllFiles = 0;
    Enumeration e = dirContents.elements();
    while (e.hasMoreElements()) {
      FileSystemPart component =
        (FileSystemPart) e.nextElement();
      sizeOfAllFiles = sizeOfAllFiles +
                       (component.getComponentSize());
    }
    return sizeOfAllFiles;
  }

} // End of class

