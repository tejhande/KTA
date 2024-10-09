package practice;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		// Creating Student objects
		Student s1 = new Student(101, "Ravi", 20);
		Student s2 = new Student(102, "Ajay", 18);
		Student s3 = new Student(103, "Neha", 22);

		// Creating ArrayList of Student type
		ArrayList<Student> studentList = new ArrayList<>();

		// Adding students to the list
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		// Printing the ArrayList of students
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
