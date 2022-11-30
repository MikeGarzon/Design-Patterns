import java.util.*;

public class Stack {
  private Vector stackEntries = new Vector();

  public void push(Object a) {
    stackEntries.addElement(a);
  }
  public Object pop() {
    if (stackEntries.size() == 0) {
      return null;
    } else {
      Object a =
        stackEntries.elementAt(stackEntries.size() -
            1);
      stackEntries.removeElementAt(stackEntries.size() -
          1);
      return a;
    }
  }
  public boolean isEmpty() {
    if (stackEntries.size() == 0) {
      return true;
    } else {
      return false;
    }
  }

  public void reverse() {
    Vector temp = new Vector();

    for (int i = stackEntries.size() - 1; i >= 0; i--) {
      temp.addElement(stackEntries.elementAt(i));
    }
    stackEntries = temp;
  }
}
