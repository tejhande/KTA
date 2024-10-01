package multiThreading;

public class TrySleep {

	public static void main(String[] args) throws InterruptedException {
		Sleep1 thSleep1 = new Sleep1();
		thSleep1.start();
		thSleep1.sleep(1000);

		int num = 10;
		for (int i = 1; i < 10; i++) {
			{
				System.out.println("Table:- " + i * num);
			}

		}
	}
}
