package electronic;

public class Laptop implements ElectronicDevice {
	private String brand;

	public Laptop(String brand) {
		this.brand = brand;
	}

	@Override
	public void turnOn() {
		System.out.println(brand + " Laptop is now turned on.");
	}
}
