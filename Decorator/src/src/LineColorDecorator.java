package design.decorator.src;

public class LineColorDecorator extends ShapeDecorator{

    protected Color color;
    public LineColorDecorator(Shape decoratedShape, Color color) {
    super(decoratedShape);
    this.color = color;
    }

    @Override
    public void draw() {
    decoratedShape.draw();
    System.out.println("Line Color: " + color);
    }

    // no change in the functionality
    @Override
    public void areaCalc() {
    decoratedShape.areaCalc();
    }

    @Override
    public String description() {
    return decoratedShape.description() + " drawn with " + color + " color.";
    }

    // no change in the functionality
    @Override
    public boolean isVisible() {
    return decoratedShape.isVisible();
    }
}
