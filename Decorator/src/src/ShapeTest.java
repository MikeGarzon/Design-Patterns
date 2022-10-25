// Exercise adapted by Henry Diosa of example on https://dzone.com/articles/decorator-design-pattern-in-java. Author:  Brijesh Saxena (Aug. 23/2018).
//This adaptation was with academic purposes (First semester / 2020).

package design.decorator.src;

public class ShapeTest {

	public static void main(String[] args) {
		
		/*** Creating objects without decoration...***/

		System.out.println("-----Creating Simple Shape Objects without decoration. -------");
		System.out.println("------------------------------------------------------------------");
        Shape circle = new Circle(5,true);        
        circle.draw();
        circle.areaCalc();
        
        Shape rectangle = new Rectangle(5,4,true);
        rectangle.draw();
        rectangle.areaCalc();
        
        /***** Nesting of functionalities in only statement for circle1***/
        
        System.out.println("-----Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness of 2 ----");
        System.out.println("------------------------------------------------------------------");
        Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(
        new LineThinknessDecorator(new Circle(2,true), 2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
        circle1.draw();
        circle1.areaCalc();
 

        /** Order of decoration is also not much important here since all are unique functionalities.
         we can also do this nesting of functionalities in separate statements. **/

        System.out.println("------Creating object with similar functionalities in separate statements.-----");
        
        System.out.println("------------------------------------------------------------------");
        Circle c = new Circle(3,true);
        LineThinknessDecorator lt = new LineThinknessDecorator(c, 2.0d);
        LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.DASH);
        LineColorDecorator lc = new LineColorDecorator(ls, Color.BLUE);
        FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
        Shape circle3 = fc;
        circle3.draw();
        circle3.areaCalc();
        
        /***Decorating a circle   ****/
        
        System.out.println("----Creating Decorated Circle with Green Color, Black Lines.----");
        System.out.println("------------------------------------------------------------------");
        Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(10,true), Color.BLACK), Color.GREEN);
        circle2.draw();
        circle2.areaCalc();
          
        /*** Decorating a rectangle   ****/
        
        System.out.println("------Creating Decorated Rectange with Yellow Color, Red Lines in double dash pattern.-----");
        System.out.println("------------------------------------------------------------------");
        Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(4,10,false), Color.RED), Color.YELLOW);
        rectangle1.draw();
        rectangle1.areaCalc();
	}
}
