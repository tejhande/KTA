package b_basicCalculations;

import java.util.Scanner;

public class Area_2 {

	public static void main(String[] args) {

//		int side = 20;
//		System.out.println("Area Of Sqaure:- "+side*side);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length: ");
		int l=sc.nextInt();
//		System.out.println("Enter Breadth: ");
//		int b=sc.nextInt();
		int area = l*l;
		System.out.println("Area Of Rectangle:- "+area);
		
		
		sc.close();
		
	}

}
 