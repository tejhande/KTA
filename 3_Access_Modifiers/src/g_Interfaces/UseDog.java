package g_Interfaces;

public class UseDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		System.out.print("Our Dog is ");
		dog1.Eat(); // Calling the implemented Eat method
		System.out.println("Our Dog has " + Animal1.no_Of_Legs + " Legs"); // Access static variable from interface
		System.out.println("Name of our Dog is " + dog1.name);
		System.out.println("Breed of our Dog is " + dog1.breed);
	}
}
