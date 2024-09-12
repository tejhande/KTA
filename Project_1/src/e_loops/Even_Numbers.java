package default_1;

import java.util.Scanner;

public class Even_Numbers {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter First Number:- ");
		int firstNumber = myObj.nextInt();
		System.out.print("Enter Second Number:- ");
		int secondNumber = myObj.nextInt();

		while (firstNumber <= secondNumber) {
			if (firstNumber % 2 == 0)
				System.out.println(firstNumber);
			firstNumber++;
		}
		
		myObj.close();

	}


}
