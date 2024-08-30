package default_1;

public class Car extends Vehicle { // extended car class to vehicle

	int speed = 100;     // overriding speed
	
	void start() {
		System.out.println("Vehicle is running faster");
	}
}
