package default_1;

public class CountPrime {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr;
		int count = 0;

		arr = new int[35];
		for (int i = 0; i < arr.length; i++) {
			int b = (int) (Math.random() * 100);
			arr[i] = b;
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		System.out.println("Total Prime numbers in array:- " + count);

	}

}
