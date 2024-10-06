package linkedList1;

import java.util.LinkedList;
import java.util.Scanner;

// Write a Java program to find a middle element of singly linkedList 
// the program should take a LinkedIist as input and return the middle element
public class MiddleLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		Scanner mScanner = new Scanner(System.in);
//	Input Elements to the linkedList
		for (int i = 0; i < 5; i++) {
			System.out.print("Add element at position " + i + " :- ");
			linkedList.add(mScanner.next());
		}
		mScanner.close();

//		Printing List&Size
		System.out.println("LinkedList:- " + linkedList);
		System.out.println("Size:- " + linkedList.size());

//		Printing MiddleElement
		int middleIndex = linkedList.size() / 2;
		System.out.println(linkedList.get(middleIndex));
	}

}
