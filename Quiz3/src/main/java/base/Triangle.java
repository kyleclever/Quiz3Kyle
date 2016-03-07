package base;
public class Triangle extends GeometricObject {
	/**
	 * Three double data fields
	 */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	/**
	 * A no-arg constructor that creates a default triangle and A constructor
	 * that creates a triangle with the specified side1, side2, and side3.
	 */
	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * The accessor methods for all three data fields
	 * 
	 */
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	/**
	 * A method named getArea() that returns the area of this triangle.
	 */
	@Override
	public double getArea() {
		double hP = getPerimeter() / 2; // half Parameter
		return Math.sqrt(hP * (hP - side1) * (hP - side2) * (hP - side3));
	}

	/**
	 * A method named getPerimeter() that returns the parameter of this
	 * triangle.
	 */
	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	/**
	 * A method named toString() that returns a string description for the
	 * triangle.
	 */
	public String toString() {
		return "The area of a triagngle with sides" + side1 + ", " + side2 + " and " + side3 + " is: " + getArea();
	}
}