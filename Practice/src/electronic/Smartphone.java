package electronic;

public class Smartphone implements ElectronicDevice {
	private String model;

	public Smartphone(String model) {
		this.model = model;
	}

	@Override
	public void turnOn() {
		System.out.println(model + " Smartphone is now turned on.");
	}
}
