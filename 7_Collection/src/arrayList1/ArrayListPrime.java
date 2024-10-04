package arrayList1;

import java.util.ArrayList;

public class ArrayListPrime {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int number = 0; number < 100; number++) { // Looping from numbers from 0 to 100

			boolean isPrime = true; // setting isPrime to true as default

			if (number <= 1) { // if number is 0 or 1 setting isPrime to false
				isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(number); i++) { // looping from 2 to square root of the number
					if (number % i == 0) { // if it is divisible by any int i then setting isPrime to false
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				al.add(number); // if number is prime adding it to the ArrayList
			}

		}

		System.out.println(al);
	}

}
