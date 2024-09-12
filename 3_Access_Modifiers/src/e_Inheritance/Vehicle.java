package e_Inheritance;

public class Vehicle {

	double speed1= (Math.random())*100; // using math.randomm to get random speed
	double speed = Math.round(speed1);
	String brand;						// Brand Name
	int no_Of_Passengers;				// Passengers
	
	
	void start() {
		System.out.println("The Vehicle is running");
	}
}
