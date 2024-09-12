package default_1;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Radius of circle:- "); // Input from user
		int radius = myObj.nextInt();
		double area = Math.PI * radius * radius; // calculating area
		System.out.println("Area of circle= " + area);
		myObj.close();

	}

}
