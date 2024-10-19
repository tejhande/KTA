package default_1;
// write a program for counting the number of prime numbers in the array, add random numbers to the array, take array size from the user

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];
		Random random = new Random();

		// Generate random numbers and populate the array
		for (int i = 0; i < size; i++) {
			numbers[i] = random.nextInt(100) + 1;
		}

		System.out.println("Generated Array: " + Arrays.toString(numbers));

		int count = 0;
		int[] primeNumbers = new int[size];

		// Count prime numbers and store them in a separate array
		for (int num : numbers) {
			boolean isPrime = primeNumbers[num] == primeNumbers[num + 1];
			// Check if the number is prime
			if (isPrime(num)) {
				primeNumbers[count] = num;
				count++;
			}
		}
		System.out.println("There are " + count + " prime numbers in the array.");
		if (count >= 1) {
			System.out.print("Sorted Prime Numbers --> ");
			Arrays.sort(primeNumbers);
			for (int i = 0; i < count; i++) {
				System.out.print(primeNumbers[i] + " ");
			}
		}
		scanner.close();
	}
}
