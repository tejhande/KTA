package multiThreading;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {
		int num = 5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
}
