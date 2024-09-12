package default_2;

public class Manager extends Employee {  // Extended to employee
	
	String emp_designation = "Project Manager";
	
	void show() {	
		System.out.println("Employee Designation:- "+ emp_designation);
		System.out.println("Employee ID :- "+ emp_ID);
		System.out.println("Employee Name :- "+emp_Name);
	}
}
