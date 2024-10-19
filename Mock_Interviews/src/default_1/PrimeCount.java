package default_1;
// write comments for full program 

import java.util.Arrays;
import java.util.Scanner;

public class PrimeCount {
	public static boolean isPrime(final int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(final String[] args) {
		final Scanner mScanner = new Scanner(System.in);

		System.out.print("Enter size of array:- ");
		final int size = mScanner.nextInt();
		int[] arr;
		arr = new int[size];
		int[] primeNumbers;
		int count = 0;
		mScanner.close();
		for (int i = 0; i < size; i++) {
			final int num = (int) (Math.random() * 100);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count = count + 1;
			}
		}
		primeNumbers = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				primeNumbers[j] = arr[i];
				j++;
			}

		}
		System.out.println();
		System.out.println("There are " + count + " prime numbers in the array.");
		if (count >= 1) {
			System.out.print("Sorted Prime Numbers --> ");
		}
		Arrays.sort(primeNumbers);
		for (int i1 = 0; i1 < primeNumbers.length; i1++) {
			System.out.print(primeNumbers[i1] + " ");
		}

	}
}