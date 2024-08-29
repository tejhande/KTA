package default_2;

public class UseDog {

	public static void main(String[] args) {
		Dog dog1= new Dog();
		System.out.print("Our Dog is ");
		dog1.Eat();
		System.out.println("Our Dog has "+ dog1.no_Of_Legs + " Legs");
		System.out.println("Name of our Dog is "+ dog1.name);
	}

}
