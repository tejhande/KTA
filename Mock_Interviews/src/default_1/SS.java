package default_1;

public class SS {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if (i % 2 == 1 || (i == 2 && j == 1) || (i == 4 && j == cols)) {
					System.out.print(j);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}