package default_1;
import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Side1:- ");
		double side1 = myObj.nextDouble();
		System.out.println("Enter Side2:- ");
		double side2 = myObj.nextDouble();
		
		double hypotenuous = (side1*side1+side2*side2);
		double sqrt = Math.sqrt(hypotenuous);   //Math.sqrt(hypotenuous) used to find square 
												// root passed hypotenuous as parameter to find square root
		System.out.println("Hypotenuous of triangle is "+ sqrt);
		
		myObj.close();
	}

}
