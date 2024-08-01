package default_1;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter No. Of Day:- ");
		int number = myObj.nextInt();

		if (number == 1)
			System.out.println("Monday");
		else if (number == 2)
			System.out.println("Tuesday");
		else if (number == 3)
			System.out.println("Wednesday");
		else if (number == 4)
			System.out.println("Thursday");
		else if (number == 5)
			System.out.println("Firday");
		else if (number == 6)
			System.out.println("Saturday");
		else if (number == 7)
			System.out.println("Sunday");
		else
			System.out.println("Wrong Input !");

		myObj.close();
	}

}
