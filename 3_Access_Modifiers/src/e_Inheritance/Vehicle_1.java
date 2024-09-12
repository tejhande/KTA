package e_Inheritance;

public class Vehicle_1 {

	double speed1 = Math.random()*100; 		// getting random Speed
	final double speed = Math.round(speed1);
	int no_Of_Seats;
	
	void start() {
		System.out.println("Vehicle has started");
	}
}
