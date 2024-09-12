package b_basicCalculations;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
// WAP to take a string from user Also take his age and city and print it in a sentence as a output
//		Eg. Hello my name is Tejas. I am 21 years old and I belong to Pune.

		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter Your Name:- ");
		String Name = myObj.next();
		System.out.println("Enter Your Age:- ");
		int Age = myObj.nextInt();
		System.out.println("Enter Your City:- ");
		String City = myObj.next();
		
		System.out.println("Hello My Name is "+Name+". "+ "I am "+Age+ " years old and I belong to "+ City+ ".");
		 myObj.close();
	}

}
	