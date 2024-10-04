// implement a method to reverse an array list in java the method take an array 
// list as input and return a new array list with elements in reverse order
package arrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();

		Scanner myScanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter at index" + i); // Taking 5 inputs
			al.add(myScanner.next());
		}
		myScanner.close();

		System.out.println("Before Reverse:- " + al);
		for (int i = al.size() - 1; i >= 0; i--) { // Reversing arrayList
			al1.add(al.get(i));
		}

		System.out.println("After Reverse:- " + al1); // printing after reversal
	}

}
