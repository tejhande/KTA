package b_Strings;

public class Trim {

	public static void main(String[] args) {
		String str1 = "    Hello World";
		System.out.println("str1:- " + str1);
		System.out.println(str1.trim());
		System.out.println();

		String str2 = "Hello Wolrd";
		System.out.println("str2:- " + str2);
		System.out.println(str2.toUpperCase());
		System.out.println();

		String str3 = "HELLO WOLRD";
		System.out.println("str3:- " + str3);
		System.out.println(str3.toLowerCase());
		System.out.println();

		String str4 = "Hello Wolrd";
		System.out.println("str4:- " + str4);
		System.out.println(str4.startsWith("H"));
		System.out.println();

		String str5 = "Hello Wolrd";
		System.out.println("str5:- " + str5);
		System.out.println(str5.endsWith("d"));
		System.out.println();

		String str6 = "Hello Wolrd";
		System.out.println("str6:- " + str6);
		System.out.println(str6.contains("d"));
		System.out.println();

		String str7 = "Hello Wolrd";
		System.out.println("str7:- " + str7);
		System.out.println(str7.replace("l", "L"));
	}

}
