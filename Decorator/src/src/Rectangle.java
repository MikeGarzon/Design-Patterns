package design.decorator.src;

public class Rectangle implements Shape{
	
	String shapeType = "rectangle";
	double height;
	double width;
	boolean visible;
	double areaM2;

    public Rectangle() {
        super();
        };
       
   public Rectangle(double h, double w, boolean v) {
        	height = h;
        	width = w;
        	visible = v;
        	System.out.println("Simulated rectangle object created has a height of  " + height + " meters and width is: " + width + " .The visibility is: " + visible);	
        };
    
   @Override
    public void draw() {
    System.out.println("Simulating draw of: " + shapeType);
    }

    @Override
    public void areaCalc() {
    	areaM2= height * width;
    System.out.println("The rectangle area is: " + areaM2 + " square meters" + "\n");
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
