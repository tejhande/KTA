package b_ThrowThrows;

public class Throws {

//	Using throws keyword 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
//		3000 will take a pause for 3seconds before the next thread to execute 
		Thread.sleep(3000);
		System.out.println("BYE");
		

	}

}

//WAP to create a method to input age of the user and check if he is eligible to vote or not
// if he is eligible to vote the fire an arithmetic exception