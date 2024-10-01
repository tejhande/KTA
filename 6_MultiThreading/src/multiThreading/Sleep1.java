package multiThreading;

public class Sleep1 extends Thread {

	@Override
	public void run() {
		for (int i = 101; i < 120; i++) {
			if (i % 2 == 0) {
				System.out.println("Even:- " + i);
			}
		}
	}
}