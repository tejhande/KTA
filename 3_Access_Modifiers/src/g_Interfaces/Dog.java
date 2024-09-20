package g_Interfaces;

public class Dog extends Animal {

	// Instance variables
	String breed = "Doberman";
	protected String name = "Monty";

	@Override
	public void Eat() {
		System.out.println("eating food.");
	}
}
