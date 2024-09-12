package default_1;

import java.util.Scanner;

public class While_Loop_Odd_Numbers_Inputs {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter First No.:- ");
		int a = myObj.nextInt();
		System.out.println("Enter Second No.:- ");
		int b = myObj.nextInt();

		while (a <= b) {
			if (a % 2 == 1)
				System.out.println(a);
			a++;
		}

		myObj.close();
	}

}
