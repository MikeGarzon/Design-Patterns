package src;

public class LuxuryCAR implements Luxury {
  private String name;
  public LuxuryCAR(String cName) {
    name = cName;
  }
  public String getLuxuryName() {
    return name;
  }
  public String getLuxuryFeatures() {
    return "src.Luxury Car Features ";
  };

} // End of class


