package multiThreading;

public class EvenThread extends Thread {

	@Override
	public void run() {
		for (int i = 101; i < 150; i++) {
			if (i % 2 == 0) {
				System.out.println("Even:- " + i);
			}
		}
	}
}
