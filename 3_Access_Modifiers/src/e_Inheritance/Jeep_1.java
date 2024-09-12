package e_Inheritance;

public class Jeep_1 extends Car_1 {

	public static void main(String[] args) {
	
		Jeep_1 jeep = new Jeep_1();  // created obj for Jeep class
		System.out.println("Car Speed:- "+ jeep.speed);
		jeep.start();
	}
}
