package default_2;

public class UseCat {

	public static void main(String[] args) {

		Cat cat1 = new Cat();	
		System.out.print("Our cat is ");
		cat1.Eat();
		System.out.println("Our cat has "+ cat1.no_Of_Legs + " Legs");
		System.out.println("Name of our cat is "+ cat1.name);
		

	}

}
