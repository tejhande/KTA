package linkedList1;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("Tejas");
		link1.add("Mauli");
		link1.add("Sandesh");

		System.out.print("Link:- ");
		System.out.println(link1);

		link1.add(1, "Tuka");
		System.out.print("After adding at node 1:- ");
		System.out.println(link1);

		link1.addFirst("Karan");
		System.out.print("After adding at 1st node:- ");
		System.out.println(link1);

		link1.addLast("Rohan");
		System.out.print("After adding at last node:- ");
		System.out.println(link1);
	}

}
