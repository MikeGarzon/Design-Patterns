package src;

public class MotorcycleVehicleFactory extends VehicleFactory{
    public LuxuryMotorcycle getLuxury() {
        return new LuxuryMotorcycle("Luxury-EM");
    }
    public NonLuxuryMotorcycle getNonLuxury() {
        return new NonLuxuryMotorcycle("Non-Luxury-EM");
    }
}
