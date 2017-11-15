

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	/*
	 * Calculates area of a kite
	 * @param length and width
	 */
	public double calculateArea() {
		double rectangleArea = length * width;
		return rectangleArea;
	}

	/*
	 * Calculates perimeter of a kite
	 * @param length and width
	 */
	public double calculatePerimeter() {
		double rectanglePerimeter = 2 * (length + width);
		return rectanglePerimeter;
	}

	/*
	 * Prints length, width, area and perimeter of a rectangle
	 */
	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
