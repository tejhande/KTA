package stack1;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>(); // Creating a new Stack of Strings
		s1.push("A"); // Pushing "A" onto the stack
		s1.push("B"); // Pushing "B" onto the stack
		s1.push("C"); // Pushing "C" onto the stack

		System.out.println(s1); // Printing the entire stack: Output will be [A, B, C]

//		System.out.println(s1.pop()); // This would remove and return "C"
//		System.out.println(s1); // If uncommented, the stack would now be [A, B]

		System.out.println(s1.peek()); // Peeks at the top element without removing it: Output will be "C"
		System.out.println(s1); // Stack remains unchanged: [A, B, C]

		System.out.println(s1.search("B")); // Searches for "B" in the stack: Output will be 2 (position of "B" from the
											// top)

	}

}
