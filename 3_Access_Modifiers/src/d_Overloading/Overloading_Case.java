package d_Overloading;
// byte ==> short ==> char ==> integer ==> long ==> float ==> double

public class Overloading_Case {
	void m1() {
		System.out.println("I am without parameter");
	}
	
	void m1(int a) {
		System.out.println("I am with 1 int parameter");
	}
	
	void m1(int a, int b) {
		System.out.println("I am with 2 int parameter");
	}
	
	void m1(double a, double b) {
		System.out.println("I am with 2 double parameter");
	}
	
}
