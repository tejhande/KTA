package b_ThrowThrows;

import java.util.Scanner;

public class Vote {

		
		public static void main(String[] args) {
		Scanner myObj =new Scanner(System.in);
		System.out.print("Enter Your Age:- ");
		int age = myObj.nextInt();
		
		if (age<=18) {
//			checking if the age is less than 18
			throw new ArithmeticException("You Can not Vote if youre age is less than 18");
		}
		else if(age>100) {
			System.out.println("How you're still alive at the age of "+age +" please die..!");			
		}
		else {
//			printing age
			System.out.println("The age is "+age +" you can vote");
		}
	}
}
