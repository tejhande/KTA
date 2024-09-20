package b_Strings;

public class Strings_Concat {

	public static void main(String[] args) {

		String s1 = "Deepak";
		System.out.println(s1);
		System.out.println(s1.hashCode());

		String s2 = s1.concat(" Kumar");
		System.out.println(s2);
		System.out.println(s2.hashCode());



	}

}
