package linkedList1;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("Tejas");
		link1.add("Mauli");
		link1.add("Sandesh");
		System.out.println("Link1 :- " + link1);

		LinkedList<String> link2 = new LinkedList<String>();
		link2.addAll(link1);
		link2.add("Tukaram");
		System.out.println("Link2 :- " + link2);
	}

}
