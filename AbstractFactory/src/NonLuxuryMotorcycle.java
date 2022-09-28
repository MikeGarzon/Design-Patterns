package src;

public class  NonLuxuryMotorcycle implements NonLuxury{
    private String name;
    public NonLuxuryMotorcycle(String sName) {
        name = sName;
    }
    public String getNLName() {
        return name;
    }
    public String getNLFeatures() {
        return "Non-Luxury  Motorcycle Features ";
    };
}
