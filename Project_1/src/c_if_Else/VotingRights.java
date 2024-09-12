package default_1;

import java.util.Scanner;

public class VotingRights {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Your Age:- ");
		int a = myObj.nextInt();
		if (a>18)
			{	
				System.out.println("You are eligible to vote");
				System.out.println("Your age is "+a);
			}
		else
			{	
				System.out.println("You are not eligible to vote");
				System.out.println("Your age is "+a);
			}
		myObj.close();

	}

}
