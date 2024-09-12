package c_if_Else;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Number for A");
		int a = myObj.nextInt();
		System.out.println("Enter Number for B");
		int b = myObj.nextInt();
		System.out.println("Enter Number for C");
		int c = myObj.nextInt();

		// int greatest = Math.max(a, Math.max(b, c));
		// System.out.println(greatest+" Is the greatest");

		if (a > b) {
			if (a > c) {
				System.out.println("A is greatest ie. " + a);
			} else {
				System.out.println("C is greatest ie. " + c);
			}
		}

		else {
			if (b > c) {
				System.out.println("B is greatest ie. " + b);
			} else {
				System.out.println("C is greatest ie. " + c);
			}
		}

		myObj.close();
	}

}
