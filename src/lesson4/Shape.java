/**
 * 
 */
package lesson4;

/**
 * @author S Keem
 *
 *	Super class example
 */
public class Shape {

	public String myType;
	public double area = 0.0;
	public double perimeter = 0.0;
	
	protected int id;
	
	Shape() {
		myType = "Unknown Shape";
		id = (int)(Math.random()*100);
		area = 0.0;
		perimeter = 0.0;
	}
	
	public int getId() {
		return id;
	}
	
}
