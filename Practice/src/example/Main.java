package example;

public class Main {
	public static void main(String[] args) {
		// Create a Person object
		Person person = new Person("Sandesh", "Tikande");
		System.out.println("Person First Name: " + person.getFirstName());
		System.out.println("Person Last Name: " + person.getLastName());

		// Create an Employee object
		Employee employee = new Employee("Mauli", "Zambare", "E123", "Software Engineer");
		System.out.println("Employee First Name: " + employee.getFirstName());
		System.out.println("Employee Last Name (with Job Title): " + employee.getLastName());
		System.out.println("Employee ID: " + employee.getEmployeeId());
	}
}
