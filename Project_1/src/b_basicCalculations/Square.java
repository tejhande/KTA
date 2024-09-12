package default_1;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Number To find Square:- "); // Input from user
		int number = myObj.nextInt();
		int square = number * number;
		System.out.print("Square of " + number + " is :- " + square); // calculating area

		myObj.close();
	}

}
