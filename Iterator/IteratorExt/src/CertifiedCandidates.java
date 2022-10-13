import java.util.*;

public class CertifiedCandidates implements Iterator {
  private Vector v;
  AllCandidates ac;
  String certificationType;
  Candidate nextCandidate;
  Enumeration ec;


  public CertifiedCandidates(AllCandidates inp_ac,
      String certType) {
    ac = inp_ac;
    certificationType = certType;
    ec = inp_ac.getAllCandidates();
  }
  public boolean hasNext() {
    boolean matchFound = false;
    while (ec.hasMoreElements()) {
      Candidate tempObj = (Candidate) ec.nextElement();
      if (tempObj.getCertificationType().equals(
            certificationType)) {
        matchFound = true;
        nextCandidate = tempObj;
        break;
      }
    }
    if (matchFound == true) {
    } else {
      nextCandidate = null;
    }
    return matchFound;
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
