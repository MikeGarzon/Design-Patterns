package src;

public class NonLuxuryCAR implements NonLuxury {
  private String name;
  public NonLuxuryCAR(String sName) {
    name = sName;
  }
  public String getNLName() {
    return name;
  }
  public String getNLFeatures() {
    return "Non-src.Luxury CAR Features ";
  };

} // End of class