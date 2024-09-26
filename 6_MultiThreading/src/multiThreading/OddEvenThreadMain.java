// WAP to create 2 threads 1 thread will be finding the odd numbers from 1 to 50 
// thread 2 will be finding even numbers from 101 to 150. 
// check the priorities of both the threads and set then to 4 and 8 respectively. 
// try to execute it. Also try to handle illegal Argument exception.l

package multiThreading;

public class OddEvenThreadMain {

	public static void main(String[] args) throws IllegalArgumentException {

		int evenPrio = 4; // Setting priority for even
		int oddPrio = 8; // Setting priority for odd

		OddThread threadOdd = new OddThread(); // Creating Obj for oddThread
		try {
			threadOdd.setPriority(oddPrio);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

		EvenThread threadEven = new EvenThread(); // Creating Obj for EvenThread
		try {
			threadEven.setPriority(evenPrio);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

		// Starting Threads
		threadEven.start();
		threadOdd.start();
	}

}
