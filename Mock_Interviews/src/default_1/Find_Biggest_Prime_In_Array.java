package default_1;

import java.util.Arrays;

public class Find_Biggest_Prime_In_Array {

	public static void main(String[] args) throws InterruptedException {
		int[] arr = new int[15];

		// Fill the array with random integers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}

		// Sort the array
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		Arrays.sort(arr);

		// Print the array for reference
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		// Variable to store the largest prime number
		int largestPrime = -1;

		// Loop to find the largest prime in the array
		for (int i = arr.length - 1; i >= 0; i--) {
			Thread.sleep(0);
			System.out.println(arr[i]);
			int num = arr[i];
			boolean isPrime = true;

			// Prime checking logic
			if (num <= 1) {
				isPrime = false; // Numbers <= 1 are not prime
			} else {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						isPrime = false; // If divisible, it's not prime
						break;
					}
				}
			}

			// If it's prime, set it as the largest prime and break
			if (isPrime) {
				largestPrime = num;
				break;
			}
		}

		if (largestPrime != -1) {
			System.out.println("The largest prime number in the array is: " + largestPrime);
		} else {
			System.out.println("No prime number found in the array.");
		}
	}
}
