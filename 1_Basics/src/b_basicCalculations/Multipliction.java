package b_basicCalculations;

import java.util.Scanner;

public class Multipliction {

	public static void main(String[] args) {

		
// WAP to take 2 float values as input from the user and print its multiplication as output

		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the value for float :- ");
		float float_var1 = myObj.nextFloat();
		System.out.println("Enter the value for float :- ");
		float float_var2 = myObj.nextFloat();
		float multiplication = float_var1 * float_var2 ;
		System.out.println("Multiplication of the float values :- "+ multiplication);

		myObj.close();
	}

}
 