package z_practice;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Starting Number:- "); // Input from user
		int start = myObj.nextInt();
		System.out.print("Enter Ending Number:- "); // Input from user
		int end = myObj.nextInt();

		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		myObj.close();
	}

	public static boolean isPrime(int number) {
		if (number <= 1) { // checks number is smaller than 1
			return false;
		}  
		for (int i = 2; i <= Math.sqrt(number); i++) { // iterating from 2 to square root of the number
			if (number % i == 0) { // checking number is fully divisible by i
				return false;
			}
		}
		return true; // otherwise printing as prime number

	}

}
