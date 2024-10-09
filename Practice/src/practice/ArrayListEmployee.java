package practice;

import java.util.ArrayList;

public class ArrayListEmployee {

	public static void main(String[] args) {
		// Creating Employee objects
		Employee e1 = new Employee(201, "Rahul Sharma", "Software Engineer", 75000.00);
		Employee e2 = new Employee(202, "Priya Mehta", "Product Manager", 90000.00);
		Employee e3 = new Employee(203, "Anil Kumar", "HR Manager", 65000.00);

		// Creating an ArrayList of Employee type
		ArrayList<Employee> employeeList = new ArrayList<>();

		// Adding employees to the ArrayList
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		// Printing all employees in the list
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
