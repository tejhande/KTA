package default_1;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {

		
// Perimeter of square		
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the Side of Square :- ");
		double side = myObj.nextDouble();
		double Perimeter = 4*side;
		System.out.println("Perimeter of the Square having "+side+" is "+ Perimeter);

	}

}
