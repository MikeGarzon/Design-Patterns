package src;

public class ElectricMotorcycleVehicleFactory extends VehicleFactory{
    public LuxuryElectricMotorcycle getLuxury() {
        return new LuxuryElectricMotorcycle("src.Luxury-EM");
    }
    public NonLuxuryElectricMotorcycle getNonLuxury() {
        return new NonLuxuryElectricMotorcycle("Non-src.Luxury-EM");
    }
}
