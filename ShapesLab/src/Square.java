

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	
	public double calculatearea() {
		double squareArea = side*side;
		return squareArea;
	}
	
	public double calculateperimeter() {
		double squarePerimeter = side + 4;
		return squarePerimeter;
	}
	
	@Override
	public String toString() {
		return "Square side: " + side + " Area: " + this.calculatearea() + " Perimeter: " + this.calculateperimeter();
	}

}
