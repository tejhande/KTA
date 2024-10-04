package arrayList1;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); // Created arrayList
//		Creating objs of ArrayList
		al.add("Aman");
		al.add("john");
		al.add("cdscd");
		al.add(null);
		al.add("hndfvd");
		al.add("csvwef");
		al.add(3, "Sandesh");

		System.out.println(al);

		System.out.println(al.contains("Aman")); // Checks it is available or not

		al.set(3, "john"); // Replacing element at index 4
		System.out.println("\n" + al);

		System.out.println("Size:- " + al.size()); // printing size of ArrayList

		System.out.println("\nAfter Remove");
		al.remove("john");
		System.out.println(al);

	}

}
