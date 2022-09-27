package src;

public class NonLuxuryElectricMotorcycle implements NonLuxury{
    private String name;
    public NonLuxuryElectricMotorcycle(String sName) {
        name = sName;
    }
    public String getNLName() {
        return name;
    }
    public String getNLFeatures() {
        return "Non-src.Luxury Electric Motorcycle Features ";
    };
}
