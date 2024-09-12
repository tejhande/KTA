package c_if_Else;

import java.util.Scanner;

public class Greater_Number_2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 1st Number:- ");
		int a = myObj.nextInt();
		System.out.println("Enter 2nd Number:- ");
		int b = myObj.nextInt();
		System.out.println("Enter 3rd Number:- ");
		int c = myObj.nextInt();

		// int greatest = Math.max(a, Math.max(b, c));
		// System.out.println("The greatest number is " + greatest);

		if (a > b && a > c)
			System.out.println("The Greatest Number is " + a);
		if (b > a && b > c)
			System.out.println("The Greatest Number is " + b);
		else
			System.out.println("The Greatest Number is " + c);

		myObj.close();
	}

}
