package e_Inheritance;

public class UseDog_1 {

	public static void main(String[] args) {
		Dog_1 dog1= new Dog_1();
		System.out.print("Our Dog is ");
		dog1.Eat();
		System.out.println("Our Dog has "+ dog1.no_Of_Legs + " Legs");
		System.out.println("Name of our Dog is "+ dog1.name);
	}

}
