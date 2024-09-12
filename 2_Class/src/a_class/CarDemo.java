package a_class;

class Car{
	int carId;
	String brand;
	String model;
	
	void displayData(){
		System.out.println("Car ID: "+carId);
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car();		// Creating a new object
		car1.carId = 101;			// Assigning the values to the objects
		car1.brand = "Mahindra";	// Assigning the values to the objects
		car1.model = "Thar";		// Assigning the values to the objects
		car1.displayData();

		// System.out.println(car1.carId); 	// Printing values of car1 on console
		// System.out.println(car1.brand); 	// Printing values of car1 on console
		// System.out.println(car1.model); 	// Printing values of car1 on console
		// System.out.println(); 				// Printing a blank line
		
		Car car2 = new Car();  	// Creating a new object
		car2.carId = 102;
		car2.brand = "Maruti";
		car2.model = "Swift";
		car2.displayData();
		
		// System.out.println(car2.carId); 	// Printing values of car1 on console
		// System.out.println(car2.brand); 	// Printing values of car1 on console
		// System.out.println(car2.model); 	// Printing values of car1 on console
	}

}
