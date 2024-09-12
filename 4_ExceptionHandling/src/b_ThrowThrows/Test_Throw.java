package b_ThrowThrows;

import java.util.Scanner;

public class Test_Throw {
	
//	Crating a method to check salary
	static void checkSalary(int salary) {
		if (salary<=0) {
//			throwing an exception if the salary is less than zero
			throw new ArithmeticException("Salary Can not be less than zero");
		}
		else {
//			printing salary
			System.out.println("The salary is "+salary);
		}
	}

	public static void main(String[] args) {

//		taking input from user 
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Your Salary:- ");
		int salary = myObj.nextInt();
		
//		closing the object created for scanner
		myObj.close();
		
//		Checking salary
		checkSalary(salary);
	}
}
