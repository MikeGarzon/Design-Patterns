package design.decorator.src;

public abstract class ShapeDecorator implements Shape{
	
    protected Shape decoratedShape;
    private String description;
    private boolean visible;
    public ShapeDecorator(Shape decoratedShape) {
          this.decoratedShape = decoratedShape;
    }
    public void draw() {
    };
    
    public void resize() {
    };
    
    public String description(){
    	return description;
    };
    
    public boolean isHide() {
    return visible;
    };
}
