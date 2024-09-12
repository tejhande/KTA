package default_3;

public class UsePuppy extends Dog {

	public static void main(String[] args) {
		
		Puppy Puppy1= new Puppy();
		System.out.print("Our Puppy is ");
		Puppy1.Eat();
		System.out.println("Our Puppy has "+ Puppy1.no_Of_Legs + " Legs");
		System.out.println("Name of our Puppy is "+ Puppy1.name);
		System.out.println("Breed of our Puppy is "+ Puppy1.breed);
	}

}
