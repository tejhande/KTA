package default_1;

import java.util.Scanner;

public class Positive_Negative_Zero {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
			
		System.out.println("Enter No.:- ");
		int a = myObj.nextInt();			// taking input
		if (a>0)								// Applying Condition
		{	
			System.out.println(a+" is Positive");
		}
		else if (a<0)								// Applying Condition
		{	
			System.out.println(a+" is Negative");
		}
		else
		{	
			System.out.println(a+" is Nither Positive nor Negative");
		}
			myObj.close();
	}

}
