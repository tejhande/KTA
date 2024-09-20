package g_Interfaces;

public abstract class Animal implements Animal1 {

	protected String breed = "Doberman";
	protected String name = "Monty";

	public static void main(String[] args) {
		System.out.println(no_Of_Legs); // Access static field from interface
	}
}
