package c_if_Else;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter No.:- ");
		double a = myObj.nextDouble();			// taking input
		double b = a%2;
		if (b==0)								// Applying Condition
			{	
				System.out.println(a+" is Even");
			}
		else
			{	
				System.out.println(a+" is Odd");
			}
		myObj.close();

	}

}
