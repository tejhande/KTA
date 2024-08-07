package default_1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Year:- ");
		int year = myObj.nextInt();
		if (year % 4 == 0)
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");

		myObj.close();
	}

}
