
public class Kite implements Shape {

	private int angle;
	private int sideA;
	private int sideB;

	public Kite(int angle, int sideA, int sideB) {
		this.angle = angle;
		this.sideA = sideA;
		this.sideB =sideB;
	}

/*
 * Calculates area of a kite
 * @param sideA,sideB,Angle
 */
	public double calculateArea() {
		double kiteArea = sideA * sideB * Math.sin(angle);
		return kiteArea;
	}

	/*
	 * Calculates perimeter of a kite
	 * @param sideA,sideB
	 */
	public double calculatePerimeter() {
		double kitePerimeter = 2*(sideA +sideB);
		return kitePerimeter;
	}

	/*
	 *prints out kite angle, sides, area and perimeter 
	 */
	public String toString() {
		return "Kite Angle: " + angle + " Sides: " + sideA + " and " + sideB + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
