package geometric;

public class Main {

	public static void main(String[] args) {
		// Geometric figures
		GeometricFigure triangle = new Triangle(5, 10, 3, 4, 5);
		System.out.println("Triangle Area: " + triangle.area());
		System.out.println("Triangle Perimeter: " + triangle.perimeter());

		GeometricFigure square = new Square(4);
		System.out.println("Square Area: " + square.area());
		System.out.println("Square Perimeter: " + square.perimeter());
	}

}
