package default_1;

import java.util.Scanner;

public class PrimeCheck2 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = myScanner.nextInt(); // Taking input from the user
		myScanner.close();

		// Optimized prime-checking logic
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
		} else if (number <= 3) {
			isPrime = true;
		} else if (number % 2 == 0 || number % 3 == 0) {
			isPrime = false;
		} else {
			for (int i = 5; i * i <= number; i += 6) {
				if (number % i == 0 || number % (i + 2) == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}
}
