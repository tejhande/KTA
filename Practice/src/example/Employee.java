package example;

public class Employee extends Person {
	private String employeeId;
	private String jobTitle;

	// Constructor
	public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	// Method to get the employee ID
	public String getEmployeeId() {
		return employeeId;
	}

	// Override the getLastName method to include the job title
	@Override
	public String getLastName() {
		return super.getLastName() + " - " + jobTitle;
	}
}
