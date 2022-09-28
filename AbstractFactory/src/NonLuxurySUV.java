package src;

public class NonLuxurySUV implements NonLuxury {
  private String name;
  public NonLuxurySUV(String sName) {
    name = sName;
  }
  public String getNLName() {
    return name;
  }
  public String getNLFeatures() {
    return "Non-Luxury SUV Features ";
  };

} // End of class


