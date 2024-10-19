package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// Create ArrayList and add integers 1-10
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		System.out.println("Original List: " + al);

		// Iterator for the list
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer no = itr.next();
			if (no % 2 != 0) {
				itr.remove(); // Remove odd numbers
			}
		}

		System.out.println("Even numbers: " + al); // Print only even numbers
	}
}
