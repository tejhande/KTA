package default_1;

public class Jeep extends Car {

	public static void main(String[] args) {
	
		Jeep jeep = new Jeep();  // created obj for Jeep class
		System.out.println("Car Speed:- "+ jeep.speed);
		jeep.start();
	}
}
