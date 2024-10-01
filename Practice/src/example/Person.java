package example;

public class Person {
	private String firstName;
	private String lastName;

	// Constructor
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Method to get the first name
	public String getFirstName() {
		return firstName;
	}

	// Method to get the last name
	public String getLastName() {
		return lastName;
	}
}
