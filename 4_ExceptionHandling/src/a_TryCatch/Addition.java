package a_TryCatch;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		
		System.out.println("I am before execution");
		
		String firstInput = "";  // To store the first input as string
		int a = 0;  // To store the first input as integer if possible
		
		try { 
			// Taking input for the first number
		    System.out.println("Enter 1st No. (You can enter a number or a word): ");
		    firstInput = myObj.nextLine();  // Take first input as string
		    a = Integer.parseInt(firstInput);  // Try to convert it to an integer
		
		    // Taking input for the second number
		    System.out.println("Enter 2nd No. (You can enter a number or a word): ");
		    String secondInput = myObj.nextLine();
		    int b = Integer.parseInt(secondInput);  // Try to convert it to an integer
		    
		    System.out.println("The Addition of " + a + " and " + b + " is " + (a + b));
		}
		catch(NumberFormatException e) {
			// Handle case where the user enters a word instead of a number
		    System.out.println("Exception Fired: Invalid input, performing concatenation.");
		    
		    // If the first input was a word or can't be parsed as an integer
		    if (a == 0 && !firstInput.isEmpty()) {
		    	System.out.println("First input is not a number, treating it as a string.");
		    }

		    // Taking input for the second number as a string
		    System.out.println("Enter 2nd No. (as word or number) :- ");
		    String secondInput = myObj.nextLine();
		    
		    System.out.println("Concatenating '" + firstInput + "' with '" + secondInput + "'");
		    System.out.println("Result: " + firstInput + secondInput);  // Concatenation of strings
		}
		finally {
			myObj.close();  // Close the scanner here
			System.out.println("Finally Block");
		}
		
		System.out.println("I am After execution");			
	}
}
