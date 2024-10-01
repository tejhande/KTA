package default_1;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		// Scanner to take input
		Scanner scanner = new Scanner(System.in);

		// enter principal amount
		System.out.println("Enter the principal amount: ");
		double principal = scanner.nextDouble();

		// enter roi
		System.out.println("Enter the rate of interest (%): ");
		double rate = scanner.nextDouble();

		// enter time yrs
		System.out.println("Enter the time (in years): ");
		double time = scanner.nextDouble();

		// Display
		System.out.println("For Principal: " + principal + ", Rate: " + rate + "%, Time: " + time + " years");

		// obj of si
		SimpleInterest simple = new SimpleInterest();
		// Simple Interest
		System.out.println("\nCalculating Simple Interest...");
		simple.interestCalculation(principal, rate, time);

		// obj of ci
		CompoundInterest compound = new CompoundInterest();
		// display Compound Interest
		System.out.println("\nCalculating Compound Interest...");
		compound.interestCalculation(principal, rate, time);

		// Close the scanner
		scanner.close();
	}
}
