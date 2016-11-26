import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver {
	public static void main(String[] args){
		Square square = new Square(100);
		Rectangle rectangle = new Rectangle(50,80);
		double x = 15.6;
		System.out.println(square.getArea());
		System.out.println(rectangle.getArea());
		System.out.println(Math.factorialRec((int)x));
		System.out.println(Math.factorialLoop((int)x));
	}
}