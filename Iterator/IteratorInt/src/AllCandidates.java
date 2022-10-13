import java.io.*;
import java.util.*;

public class AllCandidates implements Iterator {
  private Vector data;
  Enumeration ec;
  Candidate nextCandidate;

  public AllCandidates() {
    initialize();
    ec = data.elements();
  }

  private void initialize() {
    /*
      Get data from db.
     */
    data = new Vector();
    FileUtil util = new FileUtil();

    Vector dataLines = util.fileToVector("Candidates.txt");
    for (int i = 0; i < dataLines.size(); i++) {
      String str = (String) dataLines.elementAt(i);
      StringTokenizer st = new StringTokenizer(str, ",");
      data.add(
        new Candidate(st.nextToken(), st.nextToken(),
                      st.nextToken()));
    }
  }

  public boolean hasNext() {
    boolean matchFound = false;

    nextCandidate = null;

    while (ec.hasMoreElements()) {
      Candidate tempObj = (Candidate) ec.nextElement();
      nextCandidate = tempObj;
      break;
    }
    return (nextCandidate != null);
  }

  public Object next() {
    if (nextCandidate == null) {
      throw new NoSuchElementException();
    } else {
      return nextCandidate;
    }
  }

  public void remove() {};

}


