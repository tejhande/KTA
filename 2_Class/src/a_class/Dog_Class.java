package a_class;

class Dog{
	String breed;
	void displayData() {
		 System.out.println("Dog Breed: " + breed);
	}
}
public class Dog_Class {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Breed123";
		dog1.displayData();
		
		Dog dog2 = new Dog();
		dog2.breed = "Breed456";
		dog2.displayData();
		
		Dog dog3 = new Dog();
		dog3.breed = "Breed789";
		dog3.displayData();

	}

}
