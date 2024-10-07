package default_1;

//Static Method Overloading: Write a Java program that demonstrates method 
//overloading with static methods. Include at least three methods 
//with the same name but different parameters.
public class MethodOverloading {

	// Static method to add two integers
	public static int add(int a, int b) {
		return a + b;
	}

	// Static method to add three integers
	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	// Static method to add two double values
	public static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Calling the overloaded methods
		System.out.println("Sum of two integers: " + add(5, 10)); // Calls the first method
		System.out.println("Sum of three integers: " + add(5, 10, 15)); // Calls the second method
		System.out.println("Sum of two doubles: " + add(5.5, 10.3)); // Calls the third method
	}
}
