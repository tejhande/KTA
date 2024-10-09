package practice;

public class Student {
	private int id;
	private String name;
	private int age;

	// Constructor with parameters
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Default constructor
	public Student() {
		// You can initialize default values here if needed
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Override toString() for better object representation
	@Override
	public String toString() {
		return "Student { " + "ID: " + id + ", Name: '" + name + '\'' + ", Age: " + age + " }";
	}
}
