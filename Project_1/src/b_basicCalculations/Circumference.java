package default_1;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
	
// WAP to find circumference of circle
				Scanner myObj=new Scanner(System.in);
				System.out.println("Enter the radius of circle :- ");
				double radius = myObj.nextDouble();
				double circumference = 2*(22/7)*radius;
				System.out.println("Circumference of the circle having "+radius+" is "+ circumference);
				myObj.close();
	}

}
