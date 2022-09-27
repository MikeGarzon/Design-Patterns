package src;

public class LuxuryElectricMotorcycle implements Luxury{
    private String name;
    public LuxuryElectricMotorcycle(String cName) {
        name = cName;
    }
    public String getLuxuryName() {
        return name;
    }
    public String getLuxuryFeatures() {
        return "src.Luxury ElectricMotorcycle Features ";
    };
}
