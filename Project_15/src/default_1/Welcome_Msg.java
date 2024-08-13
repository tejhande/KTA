package default_1;

import java.util.Scanner;

public class Welcome_Msg {
	static Scanner myObj = new Scanner(System.in); // using Scanner to take input
	public void welcomeMsg(String name) {
		System.out.println("Welcome "+name);
	}
	
	public static void main(String[] args) {
		Welcome_Msg myObjt = new Welcome_Msg();
		System.out.print("Enter Your Name:- "); // Asking to enter name
		String name = myObj.next();	
		myObjt.welcomeMsg(name);		// printing welcome
	}

}
