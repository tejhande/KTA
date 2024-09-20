package b_Strings;

public class String_Palindrome {

	public static void main(String[] args) {
		String word = "non";
		String rWord = "";

		for (int i = word.length() - 1; i > -1; i--) {
			rWord += word.charAt(i);
		}

		System.out.println("Word:- " + word);
		System.out.println("Reversed Word:- " + rWord);

		if (word.equals(rWord)) {
			System.out.println(word + " is a palindrome string");
		} else {
			System.out.println(word + " is not a palindrome string");
		}

	}
}
