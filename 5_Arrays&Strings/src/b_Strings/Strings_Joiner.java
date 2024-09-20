package b_Strings;

import java.util.StringJoiner;

public class Strings_Joiner {

	public static void main(String[] args) {

		String s1 = "Good";
		String s2 = "Morning";
		String s4 = "Everyone";
		String s3 = String.join(" * ", s1, s2, s4);
		System.out.println(s3);

		System.out.println();

		StringJoiner sJoin = new StringJoiner(" : ");
		sJoin.add("Good");
		sJoin.add("Morning");
		System.out.println(sJoin);
	}
}
