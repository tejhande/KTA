package vector1;

//Vector Addition: Write a Java program that adds two vectors of integers 
//element- wise. The program should take two vectors as input and return a 
//new vector containing the sum of corresponding elements.

import java.util.Vector;

public class VectorAddition {

	// Method to add two vectors element-wise
	public static Vector<Integer> addVectors(Vector<Integer> v1, Vector<Integer> v2) {
		Vector<Integer> result = new Vector<Integer>();

		// Ensure both vectors have the same size
		if (v1.size() != v2.size()) {
			System.out.println("Error: Vectors must have the same size.");
			return result; // Return an empty vector if sizes don't match
		}

		// Add corresponding elements from both vectors
		for (int i = 0; i < v1.size(); i++) {
			result.add(v1.get(i) + v2.get(i));
		}

		return result;
	}

	public static void main(String[] args) {
		// Create two example vectors
		Vector<Integer> vector1 = new Vector<Integer>();
		Vector<Integer> vector2 = new Vector<Integer>();

		// Adding elements to the first vector
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);

		// Adding elements to the second vector
		vector2.add(4);
		vector2.add(5);
		vector2.add(6);

		// Display the input vectors
		System.out.println("Vector 1: " + vector1);
		System.out.println("Vector 2: " + vector2);

		// Perform element-wise addition of the two vectors
		Vector<Integer> result = addVectors(vector1, vector2);

		// Display the result
		System.out.println("Resultant Vector (Element-wise Addition): " + result);
	}
}
