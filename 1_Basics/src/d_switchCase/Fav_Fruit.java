package d_switchCase;

import java.util.Scanner;

public class Fav_Fruit {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Fruit Name:- ");
		String fav = myObj.next();

		// System.out.println("My Fav Fruit is "+ fav);

		switch (fav) {
			case "Mango":
			case "mango":
				System.out.println("My Fav Fruit is " + fav + " Because it is Sweet, juicy, rich in vitamins A and C.");
				break;
			case "Apple":
			case "apple":
				System.out.println("My Fav Fruit is " + fav + " Because it is Crisp, high in fiber and vitamin C.");
				break;
			case "Orange":
			case "orange":
				System.out.println("My Fav Fruit is " + fav + " Because it is Refreshing, high in vitamin C.");
				break;
			case "Dragon Fruit":
			case "dragon fruit":
				System.out.println("My Fav Fruit is " + fav + " Because it is Bright, mildly sweet, unique appearance.");
				break;
			case "Banana":
			case "banana":
				System.out.println("My Fav Fruit is " + fav + " Because it is Energy-boosting, rich in potassium.");
				break;
			default:
				System.out.println("Choose Another");
		}

		myObj.close();
	}

}
