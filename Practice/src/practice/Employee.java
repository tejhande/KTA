package practice;

public class Employee {
	private int employeeId;
	private String name;
	private String designation;
	private double salary;

	// Constructor with parameters
	public Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	// Default constructor
	public Employee() {
		// Default values can be initialized here if necessary
	}

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Override toString() for better object representation
	@Override
	public String toString() {
		return "Employee { " + "Employee ID: " + employeeId + ", Name: '" + name + '\'' + ", Designation: '"
				+ designation + '\'' + ", Salary: " + salary + " }";
	}
}
