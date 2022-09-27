package src;

public class MotorcycleVehicleFactory extends VehicleFactory{
    public LuxuryMotorcycle getLuxury() {
        return new LuxuryMotorcycle("src.Luxury-EM");
    }
    public NonLuxuryMotorcycle getNonLuxury() {
        return new NonLuxuryMotorcycle("Non-src.Luxury-EM");
    }
}
