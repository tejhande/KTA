package d_switchCase;

import java.util.Scanner;

public class Menu_Driven {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Choice"); // Asking to choice from 1-4
		System.out.println("1- Area Of Rectangle");
		System.out.println("2- Area Of Sqaure");
		System.out.println("3- Cicumference of circle");
		System.out.println("4- Perimeter Of Square");
		int userInput = myObj.nextInt();
		switch (userInput) {
			case 1:
				System.out.println("*** Area Of Rectangle ***");
				System.out.print("Enter Side 1 of rectangle:- ");
				int side1 = myObj.nextInt();
				System.out.print("Enter Side 2 of rectangle:- ");
				int side2 = myObj.nextInt();
				System.out.println("Area of rectangle having sides " + side1 + " and " + side2 + " is " + side1 * side2);
				break;

			case 2:
				System.out.println("*** Area Of Sqaure ***");
				System.out.print("Enter Side of Square:- ");
				int side = myObj.nextInt();
				System.out.println("Area of Square of side " + side + " is " + side * side);
				break;

			case 3:
				System.out.println("*** Cicumference of circle ***");
				System.out.print("Enter radius of Circle:- ");
				int radius = myObj.nextInt();
				System.out.println("Cicumference of circle having radius " + radius + " is " + 2 * Math.PI * radius);
				break;

			case 4:
				System.out.println("*** Perimeter Of Square ***");
				System.out.print("Enter Side of Square:- ");
				int side3 = myObj.nextInt();
				System.out.println("Perimeter of Square of side " + side3 + " is " + side3 * 4);
				break;

			default:
				System.out.println("Wrong Input!");

		}

		myObj.close();

	}

}
