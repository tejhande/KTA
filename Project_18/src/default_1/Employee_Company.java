/* WAP to create a class Employee(eld, ename, designation, company name). Use static keyword where ever required
Try to create atleast 2 objects.
Try to the change the of static variable
Create a static method to display the static variable.
Call the static variable using class name
Also call the static method using class name
*/

package default_1;

class Employee{
	int eId;
	String eName;
	String designation;
	static String cName = "JBK";		// static variable ie. class variable
	
	Employee(int eId, String eName, String designation){	// Parameterized constructor
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
	}
	
	void displayData() {						// Method to show data
		System.out.println("Employee Id:- "+eId);
		System.out.println("Employee Name:- "+eName);
		System.out.println("Employee Designation:- "+designation);
		System.out.println("Company:- "+cName);
		System.out.println();
	}
}
public class Employee_Company {

	public static void main(String[] args) {
		Employee e1 = new Employee(001, "Tejas", "Propriter");
		Employee e2 = new Employee(002, "John", "CEO");
		Employee e3 = new Employee(003, "Elon", "Project Manager");
		
		// Displaying Data
		e1.displayData();
		e2.displayData();
		e3.displayData();
		
		Employee.cName = "Marsstrong";
		// Displaying Data After Changing trade name of the company
		System.out.println("Displaying Data After Changing trade name of the company");
		System.out.println();
		e1.displayData();
		e2.displayData();
		e3.displayData();
		
	}

}
