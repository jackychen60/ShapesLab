
public class Triangle implements Shape {
	
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	public double calculateArea() {
		double triangleArea = (Math.sqrt(3) / 4) * (side*side);
		return triangleArea;
	}
	
	public double calculatePerimeter() {
		double trianglePerimeter = 3 * side;
		return trianglePerimeter;
	}
	
	public String toString() {
		return "Triangle side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
