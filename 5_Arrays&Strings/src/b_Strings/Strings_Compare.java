package b_Strings;

public class Strings_Compare {

	public static void main(String[] args) {
		for (int i = 65; i <= 122; i++) {
			System.out.println(i + " : " + (char) i);
		}

		String s1 = "Deepak";
		String s2 = "Reema";
		String s3 = "Reema";
		String s4 = "Reama";

		System.out.println("Compares lexicographically");

		System.out.println(" " + s2.compareTo(s3)); // 0
		System.out.println(s1.compareTo(s2)); // -14
		System.out.println(" " + s2.compareTo(s1)); // 14
		System.out.println(" " + s3.compareTo(s4)); // 4

		System.out.println();

		System.out.println("Compares the address of the string");
		System.out.println(s2 == s3);
	}

}
