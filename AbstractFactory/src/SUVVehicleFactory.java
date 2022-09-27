package src;

public class SUVVehicleFactory extends VehicleFactory {

  public LuxurySUV getLuxury() {
    return new LuxurySUV("src.Luxury-SUV");
  }
  public NonLuxurySUV getNonLuxury() {
    return new NonLuxurySUV("Non-src.Luxury-SUV");
  }
} // End of class


