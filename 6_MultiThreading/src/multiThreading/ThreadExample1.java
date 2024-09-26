package multiThreading;

public class ThreadExample1 {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();

		int num = 7;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}

}
