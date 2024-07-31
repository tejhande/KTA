package default_1;

import java.util.Scanner;

public class Positve_Negative {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter No.:- ");
		double a = myObj.nextDouble();			// taking input
		if (a>0)								// Appling Condition
		{	
			System.out.println(a+" is Positive");
		}
		else if (a<0)								// Appling Condition
			{	
				System.out.println(a+" is Negative");
			}
		else
			{	
				System.out.println(a+" is nither positive nor negative");
			}
		myObj.close();
	}

}
