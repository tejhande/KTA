package default_1;

public class Area_Calculation {

	void area(int side1, int side2) {
//		Area of rectangle
		int area = side1*side2;
		System.out.println("Area of rectangle having sides "+ side1 +" and "+ side2 +" is "+ area);
	}

	void area(int side1) {
//		Area of Cube
		int area = 6 * (side1*side1);
		System.out.println("Area of cube having side "+ side1 +" is "+ area);
	}

	void area(double side1) {
//		Area of circle
		double area = (2 * Math.PI * side1);
		System.out.println("Area of circle having radius "+ side1 +" is "+ area);
	}
}
