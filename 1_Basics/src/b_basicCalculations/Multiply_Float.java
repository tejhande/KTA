package b_basicCalculations;

import java.util.Scanner;

public class Multiply_Float {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter First Number:- ");
		float firstNumber = myObj.nextFloat();
		System.out.print("Enter Second Number:- ");
		float secondNumber = myObj.nextFloat();

		float multiplication = firstNumber * secondNumber;
		System.out.print("Multiplication Of both Float Numbers is == " + multiplication);

		myObj.close();

	}

}
