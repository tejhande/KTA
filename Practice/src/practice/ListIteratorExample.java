package practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// Create and populate ArrayList
		ArrayList<String> al = new ArrayList<>();
		al.add("Neha");
		al.add("Vijay");
		al.add("Shiv");
		al.add("Raj");

		System.out.println("Original List: " + al);

		// ListIterator for traversing and modifying the list
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("Neha")) {
				itr.remove(); // Remove "Neha"
			} else if (s.equals("Shiv")) {
				itr.set("Shakti"); // Replace "Shiv" with "Shakti"
			} else if (s.equals("Vijay")) {
				itr.add("Ajay"); // Add "Ajay" after "Vijay"
			}
		}

		System.out.println("Modified List: " + al); // Print modified ArrayList
	}
}
