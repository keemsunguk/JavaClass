/**
 * 
 */
package lesson4;

/**
 * @author S Keem
 *
 *	Subclass example
 */
public class Circle extends Shape{
	public double radius;
	public double diameter;
	
	Circle() {
		super();
		myType = "Circle";
		radius = 0.0;
		diameter = radius*2;
	}
	
	Circle(double r) {
		super();
		myType = "Circle";
		radius = r;
		diameter = radius*2;
		getArea();
	}

	public double getArea() {
		area = Math.PI*radius*radius;
		return area;
	}
}
