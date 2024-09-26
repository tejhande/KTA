package b_Strings;

class Student1 {
	String name;
	int age;

	// Default constructor
	Student1() {
		name = "Unknown";
		age = 0;
	}

	// Method to display student information
	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Student {
	public static void main(String[] args) {
		// Create an object of the Student class
		Student1 student = new Student1();

		// Display student's information
		student.displayInfo();
	}
}
