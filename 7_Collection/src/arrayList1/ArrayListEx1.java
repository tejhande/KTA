package arrayList1;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Comparable> al = new ArrayList<Comparable>(); // Created arrayList
//		Creating objs of ArrayList
		al.add("Aman");
		al.add("John");
		al.add("cdscd");
		al.add(null);
		al.add("hndfvd");
		al.add("csvwef");

		System.out.println(al);

		System.out.println(al.contains("Aman")); // Checks it is available or not

		al.set(4, "lope"); // Replacing element at index 4
		System.out.println("\n" + al);

		System.out.println("Size:- " + al.size()); // printing size of ArrayList

		System.out.println("\nAfter Remove");
		al.remove("John");
		System.out.println(al);

	}

}
