package e_Inheritance;

public class UseChild {

	public static void main(String[] args) {
		Child child1 = new Child();		// creating obj of child class
		child1.property();
	// Accessing properties from Parent and Grandparent class
		System.out.println("Eye Colour:- "+child1.eyeColour);
		System.out.println("Height:- "+child1.height);
		System.out.println("Property From Grandpa:- "+child1.property);
		
	}

}
