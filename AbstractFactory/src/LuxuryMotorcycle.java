package src;

public class LuxuryMotorcycle implements Luxury{
    private String name;
    public LuxuryMotorcycle(String cName) {
        name = cName;
    }
    public String getLuxuryName() {
        return name;
    }
    public String getLuxuryFeatures() {
        return "Luxury Motorcycle Features ";
    };
}
