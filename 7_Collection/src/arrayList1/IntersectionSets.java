package arrayList1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionSets {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(); // First set
		ArrayList<Integer> al2 = new ArrayList<>(); // Second set
		ArrayList<Integer> al3 = new ArrayList<>(); // Third set
		Set<Integer> intersectionSet = new HashSet<>(); // Set to store unique intersection

		Scanner myScanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in each set: ");
		int n = myScanner.nextInt(); // Get the number of elements for each set

		// Input elements for the three sets
		for (int i = 0; i < n; i++) {
			System.out.print("Add to set 1 at index " + i + ": ");
			al1.add(myScanner.nextInt());

			System.out.print("Add to set 2 at index " + i + ": ");
			al2.add(myScanner.nextInt());

			System.out.print("Add to set 3 at index " + i + ": ");
			al3.add(myScanner.nextInt());
		}

		// Closing the scanner
		myScanner.close();

		// Print the sets
		System.out.println();
		System.out.println("Set 1: " + al1);
		System.out.println("Set 2: " + al2);
		System.out.println("Set 3: " + al3);

		// Use a HashSet to find the intersection
		intersectionSet.addAll(al1); // Add all elements
		intersectionSet.retainAll(al2); // Retain only elements
		intersectionSet.retainAll(al3); // Retain only elements

		// Print the intersection of the three sets
		System.out.println("Intersection of the three sets (unique elements): " + intersectionSet);
	}
}
