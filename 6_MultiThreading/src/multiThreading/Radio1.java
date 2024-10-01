package multiThreading;

class A extends Thread {
	Radio radio;

	public A(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void run() {
		radio.play(94.3f);
	}
}

class Radio1 {
	public synchronized void play(float frequency) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Radio is playing on frequency:- " + frequency);
			Thread.sleep(1000);
		}
	}
}

public class Radio {

	public static void main(String[] args) {

	}

}
