package default_1;

public class PrimeMayuri {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // created array

		System.out.println("Prime numbers:");
		for (int num : numbers) { // looking for each number in array
			boolean isPrime = true; // by default setting isPrime variable as true
			if (num < 2) {
				isPrime = false; // 0 and 1 are not prime so false
			}
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false; // if the number is completely divisible means its not prime
					break;
				}
			}
			if (isPrime) {
				System.out.print(num + " "); // printing numbers from array if they are prime
			}
		}
	}
}
