package practice;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Create and populate Vector with integers 1-10
		Vector<Integer> v1 = new Vector<>();
		for (int i = 1; i <= 10; i++) {
			v1.add(i);
		}

		System.out.println("Original Vector: " + v1);
		System.out.println("Searching for even elements from the Vector");

		// Enumeration for traversing the Vector
		Enumeration<Integer> e = v1.elements();
		while (e.hasMoreElements()) {
			Integer i = e.nextElement();
			if (i % 2 == 0) {
				System.out.println(i); // Print even numbers
			}
		}
	}
}
