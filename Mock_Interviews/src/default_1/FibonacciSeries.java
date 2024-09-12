package default_1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter no how much series u want:- ");
		int n = myObj.nextInt();
		int a = 0, b = 1;
		System.out.println("Fibonacci Series up to "+ n+ " terms");
		
		for(int i = 1; i<= n; i++) {
			System.out.println(a);
			int nextNumber = a + b;
			a = b;
			b = nextNumber;
		}
		myObj.close();
	}

}
