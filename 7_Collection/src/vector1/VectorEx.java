package vector1;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Create a vector of integers
		Vector<Integer> v1 = new Vector<Integer>();

		// Add elements to the vector
		for (int i = 1; i <= 10; i++) {
			v1.add(i);
		}

		// Print the vector
		System.out.println(v1);

		// Using Enumeration to search for even elements
		System.out.println("Searching for even elements from the Vector");

		// Get the Enumeration of the vector elements
		Enumeration<Integer> e = v1.elements();

		// Loop through elements of the vector using Enumeration
		while (e.hasMoreElements()) {
			Integer i = e.nextElement(); // Fetch the element from the vector

			// Check if the number is even
			if (i % 2 == 0) {
				System.out.println(i); // Print the even number
			}
		}
	}
}
