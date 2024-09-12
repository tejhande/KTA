package default_1;

import java.util.Scanner;

public class While_Loop_Inputs {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter First No.:- ");
		int a = myObj.nextInt();
		System.out.println("Enter Second No.:- ");
		int b = myObj.nextInt();
		int i = a;

		while (i <= b) {
			System.out.println(i);
			i++;
		}

		myObj.close();
	}

}
