package practice;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// Create HashSet with initial capacity and load factor
		HashSet<String> hs = new HashSet<>(10, 0.50f);

		hs.add("A");
		System.out.println(hs.add("M")); // Will return true, as "M" is added for the first time
		hs.add("F");
		hs.add("D");

		System.out.println(hs); // Prints the HashSet
		System.out.println(hs.add("M")); // Will return false, as "M" is already present
		System.out.println(hs); // No change to the HashSet
	}
}
