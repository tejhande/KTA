package f_constructor;

class Employee {
    // Instance variables
    int eid;
    String eName;
    String designation;
    String city;
    double salary;

    // Constructor with no arguments
    Employee() {
        this.eid = 0;
        this.eName = "Unknown";
        this.designation = "Unknown";
        this.city = "Unknown";
        this.salary = 0.0;
    }

    // Constructor with 3 arguments
    Employee(int eid, String eName, String designation) {
        this.eid = eid;
        this.eName = eName;
        this.designation = designation;
        this.city = "Unknown";  // Default value
        this.salary = 0.0;      // Default value
    }

    // Constructor with 4 arguments (overloaded)
    Employee(int eid, String eName, String designation, String city) {
        this.eid = eid;
        this.eName = eName;
        this.designation = designation;
        this.city = city;
        this.salary = 0.0;  // Default value
    }

    // Constructor with all arguments
    Employee(int eid, String eName, String designation, String city, double salary) {
        this.eid = eid;
        this.eName = eName;
        this.designation = designation;
        this.city = city;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + eName);
        System.out.println("Designation: " + designation);
        System.out.println("City: " + city);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating Employee objects using different constructors
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Alice", "Developer");
        Employee emp3 = new Employee(102, "Bob", "Designer", "New York");
        Employee emp4 = new Employee(103, "Charlie", "Manager", "Los Angeles", 85000.50);

        // Displaying the details of each employee
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();
    }
}
