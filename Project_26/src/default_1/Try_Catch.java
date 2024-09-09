package default_1;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
	
		System.out.println("Enter 1st No. :- ");
		int a = myObj.nextInt();
		System.out.println("Enter 2nd No. :- ");
		int b = myObj.nextInt();

		myObj.close();
		
		System.out.println("I am before execution");
		
		try {
			System.out.println("The division of " + a +" and "+ b + " is "+ a/b );
		}
		
		catch(NullPointerException e) {
			System.out.println("Exception Fired "+ e.getMessage());	
			System.out.println("1");
		}

		catch(ArithmeticException e) {
			System.out.println("Exception Fired "+ e.getMessage());			
			System.out.println("2");
		}
		
		catch(Exception e) {
			System.out.println("Exception Fired "+ e.getMessage());
			System.out.println("3");
//			System.out.println(e.getMessage());  // Prints: / by zero
//		    e.printStackTrace();  // Prints the full stack trace
		}
		
		System.out.println("I am After execution");			
	}

}
