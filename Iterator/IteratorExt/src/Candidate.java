public class Candidate {
  private String name;
  private String certificationType;
  private String location;

  public Candidate(String inp_name, String inp_certType,
                   String loc) {
    name = inp_name;
    certificationType = inp_certType;
    location = loc;
  }
  public String getCertificationType() {
    return certificationType;
  }
  public String getName() {
    return name;
  }
  public String getLocation() {
    return location;
  }
}
