/**
 * 
 */
package lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author S Keem
 *
 */
public class RunShapes {

	/**
	 * @param args
	 * HW:  complete routines for getting perimeter or circumference
	 * 		Create Rectangle class
	 */
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		System.out.println(c1.myType+c1.getId());
		System.out.println(c2.myType+c2.getId());
		
		Triangle t1 = new Triangle();
		Shape t2 = new Triangle();  //OK Shape is a superclass

		System.out.println(t1.myType+t1.getId());
		System.out.println(t2.myType+t2.getId());
		
		t2 = new Circle(2.5);
		System.out.println(t2.myType+t2.getId());
		//t1 = new Circle();	//Error!

		//Example for getting area
		c1 = new Circle(2.5);
		t1 = new Triangle(2,5);
		System.out.println(c1.myType+c1.getId()+": Area="+c1.getArea());
		System.out.println(t1.myType+t1.getId()+": Area="+t1.getArea());
		System.out.println(t2.myType+t2.getId()+": Area="+t2.area);

		Object obj = new Triangle(2,4);
		
		if( obj instanceof Triangle) {
			Triangle t3 = (Triangle)obj; 
			System.out.println(t3.myType+t3.getId()+": Area="+t3.area);
		} else if ( obj instanceof Circle) {
			Circle t3 = (Circle)obj;
			System.out.println(t3.myType+t3.getId()+": Area="+t3.area);
		}
		
		Circle circles[] = null;
		List <Circle> clist = null;
	
		circles = new Circle[10];
		
		clist = new ArrayList <Circle>();
		clist.add(c1);
		clist.add(c2);
	}

}
