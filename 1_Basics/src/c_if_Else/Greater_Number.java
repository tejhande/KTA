package c_if_Else;

import java.util.Scanner;

public class Greater_Number {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter 1st No.:- ");
		double a = myObj.nextDouble();			// taking input
		System.out.println("Enter 2nd No.:- ");
		double b = myObj.nextDouble();			// taking input
		
		if (a>b)								// Applying Condition
			{	
				System.out.println(a+" is greater than "+b);
			}
		else
			{	
				System.out.println(b+" is greater than "+a);
			}
		myObj.close();
	}

}
