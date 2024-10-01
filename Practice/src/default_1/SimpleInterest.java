package default_1;

public class SimpleInterest implements Program {

	// Simple Interest
	@Override
	public void interestCalculation(double principal, double rate, double time) {
		// Simple Interest formula
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Simple Interest: " + simpleInterest);
	}
}
