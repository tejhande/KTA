package b_Strings;

public class Builder {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder1 = new StringBuilder("Mohan");
		StringBuilder stringBuilder2 = new StringBuilder(15);

		System.out.println(stringBuilder1.append(" Patil"));
		System.out.println(stringBuilder1.replace(2, 6, "nica"));
		System.out.println(stringBuilder1.reverse());
		System.out.println(stringBuilder.capacity());
		System.out.println(stringBuilder2.capacity());
		System.out.println(stringBuilder1.length());
	}

}
