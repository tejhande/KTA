package arrayList1;

import java.util.ArrayList;

public class ArrayListEx {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add("Aman");
		al.add(85);
		al.add(75.55);
		al.add(null);
		al.add(85);
		al.add(null);

		System.out.println(al.size());
		System.out.println(al);

		al.remove(3);
		System.out.println(al);
		al.set(2, 78.85); // replace data at index 2

		System.out.println("After Replacement");
		System.out.println(al);

	}

}
