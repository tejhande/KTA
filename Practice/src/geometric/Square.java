package geometric;

public class Square implements GeometricFigure {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}

	@Override
	public double area() {
		return side * side;
	}
}
