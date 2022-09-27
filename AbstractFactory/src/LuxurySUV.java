package src;

public class LuxurySUV implements Luxury {
  private String name;
  public LuxurySUV(String sName) {
    name = sName;
  }
  public String getLuxuryName() {
    return name;
  }
  public String getLuxuryFeatures() {
    return "src.Luxury SUV Features ";
  };

} // End of class


