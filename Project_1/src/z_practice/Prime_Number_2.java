package default_1;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Number:-- ");
		int number = myObj.nextInt();
		int flag = 0;

		if (number == 0 || number == 1) {
			System.out.println("0 and 1 are niether Prime nor Composite");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = 1;
					break;
				} else {
					flag = 0;
				}
			}
			if (flag == 1) {
				System.out.println(number + " Is not a Prime Number");
			} else {
				System.out.println(number + " is a Prime Number");
			}
		}
		myObj.close();
	}

}
