package jdbc_1;

public class Practice10 {

	public static void main(String[] args) {
//		write a simple program to find the word is anagram or not
		// print the anagram pair code like tea eat print true listen silent print true
		// and hello hi print false just this two words
		String[] words = { "listen", "silent", "potato", "tomato", "tea", "eat", "hello", "hi" };
		findAnagramPairs(words);

	}

	private static void findAnagramPairs(String[] words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				boolean isAnagram = isAnagram(words[i], words[j]);
				System.out.println("Anagram pair: " + words[i] + " and " + words[j] + " print " + isAnagram);
			}
		}
	}

}
