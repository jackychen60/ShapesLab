

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Triangle(rand.nextInt(100));
		case 4:
			return new Kite(rand.nextInt(180), rand.nextInt(50),rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapeArr) {
		double totalarea = 0;
		for (Shape shape : shapeArr) {
			totalarea = totalarea + shape.calculateArea();
		}
		return totalarea;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapeArr) {
		double perimeter = 0;
		for (Shape shape : shapeArr) {
			perimeter= perimeter + shape.calculatePerimeter();
		}
		return perimeter;
	}

	public static void countShapes(Shape[] shapeArr)
	{
		int rectangles = 0;
		int circles =  0;
		for(Shape x :shapeArr)
		{
			if (x instanceof Circle)
			{
				circles++;
			}
			if (x instanceof Rectangle)
			{
				rectangles++;
			}
		}
			System.out.println(circles + " Circles Found and" + rectangles + "rectangles found");
	}
}
