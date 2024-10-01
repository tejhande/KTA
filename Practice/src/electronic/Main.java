package electronic;

public class Main {
	public static void main(String[] args) {
		// Electronic devices
		ElectronicDevice laptop = new Laptop("Dell");
		laptop.turnOn();

		ElectronicDevice smartphone = new Smartphone("Samsung");
		smartphone.turnOn();
	}
}
