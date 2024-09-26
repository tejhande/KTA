package multiThreading;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadEx1 thread1 = new ThreadEx1();
		
		// Setting priority before starting the thread
		thread1.setPriority(1); // Set lower priority to thread1
		Thread.currentThread().setPriority(8); // Set higher priority to the main thread

		thread1.start(); // Start thread1 after setting priority

		int num = 7;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
}
