package default_1;

import java.util.Scanner;

public class Grade_System {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Grade[A/B/C/F]:-");
		String grade = myObj.next();
		switch (grade) {
			case "A":
				System.out.println("Excellent");
				break;
			case "B":
				System.out.println("Good");
				break;
			case "C":
				System.out.println("Average");
				break;
			case "F":
				System.out.println("Fail");
				break;
			default:
				System.out.println("Wrong Input! || [Try A/B/C/F]");
		}

		myObj.close();
	}

}
