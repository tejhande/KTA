package e_Inheritance;

public class Car_1 extends Vehicle_1 { // extended car class to vehicle

	int speed = 100;     // overriding speed
	
	void start() {
		System.out.println("Vehicle is running faster");
	}
}
