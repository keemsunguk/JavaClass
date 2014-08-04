package lesson4;

public class Triangle extends Shape {
	public double height = 0;
	public double base = 0;
	
	Triangle() {
		super();
		myType = "Triangle";
		height = 0;
		base = 0;
	}

	Triangle(double h, double b) {
		super();
		myType = "Triangle";
		height = h;
		base = b;
		getArea();
	}

	public double getArea() {
		area = base*height/2;
		return area;
	}
}
