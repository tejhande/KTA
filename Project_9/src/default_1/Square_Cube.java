package default_1;

import java.util.Scanner;

public class Square_Cube {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Number To find Square Or Cube:- "); // Input from user
		int number = myObj.nextInt();
		if (number >= 50) {
			System.out.println("Cube of " + number + " is " + number * number * number); // calculating cube
		} else {
			System.out.println("Square of " + number + " is " + number * number); // calculating area
		}

		myObj.close();
	}

}
