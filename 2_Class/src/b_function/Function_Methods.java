package default_1;

public class Function_Methods {

	public static void main(String[] args) {
		Function_Methods myObj = new Function_Methods();
		myObj.oddEven();
	}

	public void oddEven() {
		int num = 1101;
		if (num % 2 == 0) {
			System.out.println(num + " Is Even number");
		} else {
			System.out.println(num + " Is Odd number");
		}
	}
}
