package e_loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Number To Print Table:- "); // Input from user
		int number = myObj.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + " = " + number * i); // printing table
		}
		myObj.close();
	}

}
