package d_Overloading;

import b_function.Area_Calculation;

public class Use_Area_Calculation {

	public static void main(String[] args) {
		Area_Calculation myObj = new Area_Calculation();
		myObj.area(4); // area of cube
		myObj.area(5.6); // area of circle
		myObj.area(45, 84); // area rectangle
	}

}
