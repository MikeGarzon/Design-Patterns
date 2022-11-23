package design.decorator.src;

public class LineStyleDecorator extends ShapeDecorator{
	
    protected LineStyle style;
    public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
    super(decoratedShape);
    this.style = style;
    }

    @Override
    public void draw() {
    decoratedShape.draw();
    System.out.println("Line Style: " + style);
    }

    // no change in the functionality
    @Override
    public void areaCalc() {
    decoratedShape.areaCalc();
    }

    @Override
    public String description() {
    return decoratedShape.description() + " drawn with " + style + " lines.";
    }

    // no change in the functionality
    @Override
    public boolean isVisible() {
    return decoratedShape.isVisible();
    }
}
