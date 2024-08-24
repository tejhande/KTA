package default_1;

import java.util.Scanner;

public class PrimeCheck1 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter no. To check prime or not: -- ");
		int num = myObj.nextInt();
		
		boolean primeOrNot = true;
		
		if (num<=1) {
			primeOrNot = false;
		}
		else {
			for(int i=2; i<=Math.sqrt(num); i++)
			{
				if (num % i == 0) {
					primeOrNot = false;
					break;
				}
			}
		}
		if(primeOrNot) {
			System.out.println(num+ " is prime");
		}
		else {			
			System.out.println(num+ " is not prime");
		}
		myObj.close();
	}


}
