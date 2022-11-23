package design.decorator.src;

public class Circle implements Shape {
    String shapeType = "Circle object"; 
    double ratioM;
    double areaM2;
    boolean visible;
 
    public Circle() {
    super();
    };
   
    public Circle(double r, boolean v) {
    	ratioM = r;
    	visible = v;
    	System.out.println("Simulated circle object has a ratio of  " + ratioM + " meters and visibility is: " + visible);	
    };

    @Override
    public void draw() {
    System.out.println("Simulating draw of " + shapeType);
    }

    @Override
    public void areaCalc() {
    areaM2 = (Math.pow(ratioM,2))* Math.PI ;
    System.out.println("The circle area is: " + areaM2 + " square meters" + "\n");
    }

    @Override
    public String description() {
    return shapeType;
    }

    @Override

    public boolean isVisible() {
    return visible;
}
}
