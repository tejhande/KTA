package b_basicCalculations;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		
//		 WAP to take 2 Double values as input from the user and print its division as output
		
		
		Scanner myObj=new Scanner(System.in);
			System.out.println("Enter the value for double :- ");
			double double_var1 = myObj.nextDouble();
			System.out.println("Enter the value for double :- ");
			double double_var2 = myObj.nextDouble();
			double Division = double_var1 / double_var2 ;
			System.out.println("Division of the double values :- "+ Division);

			myObj.close();
	}

}
