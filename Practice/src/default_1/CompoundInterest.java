package default_1;

public class CompoundInterest implements Program {

	@Override
	public void interestCalculation(double principal, double rate, double time) {
		// Compound Interest formula
		double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
		System.out.println("Compound Interest: " + compoundInterest);
	}
}
