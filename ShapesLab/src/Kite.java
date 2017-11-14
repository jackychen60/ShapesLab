
public class Kite implements Shape {

	private int longDiagonal;
	private int shortDiagonal;
	private int sideA;
	private int sideB;

	public Kite(int longDiagonal, int shortDiagonal, int sideA, int sideB) {
		this.longDiagonal = longDiagonal;
		this.shortDiagonal = shortDiagonal;
		this.sideA = sideA;
		this.sideB =sideB;
	}


	public double calculateArea() {
		double rectangleArea = length * width;
		return rectangleArea;
	}


	public double calculatePerimeter() {
		double rectanglePerimeter = 2 * (length + width);
		return rectanglePerimeter;
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
