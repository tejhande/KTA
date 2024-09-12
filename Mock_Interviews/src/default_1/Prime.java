package default_1;

public class Prime {

	public static boolean isprime(int number) {
		if (number <=1 ) {
			return false;
		}
		
		for (int i = 2; i <=Math.sqrt(number);i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int number = 27;
		if (isprime(number)) {
			System.out.println(number+ " is a prime number");
		}
		else {
			System.out.println(number+ " is not a prime number");
		}
	}

}