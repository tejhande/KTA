package default_1;

import java.util.Scanner;

public class Smaller_Number {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 1st Number:- ");
		int a = myObj.nextInt();
		System.out.println("Enter 2nd Number:- ");
		int b = myObj.nextInt();
		System.out.println("Enter 3rd Number:- ");
		int c = myObj.nextInt();

		// int smallest = Math.min(a, Math.min(b, c));
		// System.out.println("The Smallest number is " + smallest);

		if (a < b && a < c)
			System.out.println("The Smallest Number is " + a);
		if (b < a && b < c)
			System.out.println("The Smallest Number is " + b);
		else
			System.out.println("The Smallest Number is " + c);

		myObj.close();
	}

}