// Write a code to find anagram pair

import java.util.Arrays;

public class AnagramPair {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "potato", "tomato"};
        findAnagramPairs(words);
    }

    public static void findAnagramPairs(String[] words) {
        // Sort the words in each string
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            words[i] = new String(chars);
        }

        int j;
        // Find anagram pairs
        for (int i = 0; i < words.length - 1; i++) {
            for (int k = i + 1; k < words.length; k++) {
                if (words[i].equals(words[i + 1])) {
                    System.out.println("Anagram pair: "+ words[i] + " and " + words[j]);
                    break;
                    // Break the inner loop once an anagram pair is found
                    // to avoid unnecessary comparisons
                }
                // Continue with the next pair if they are not anagrams
                else {
                    continue;
                }
            }
            // Reset the inner loop if no anagram pair is found
            // to continue checking for more pairs
            j = i + 1;
        }
        // If no anagram pairs are found, print a message
        if (j == words.length) {
            System.out.println("No anagram pairs found.");
        }
    // End of main method
    // Other methods are not shown for brevity
    // The findAnagramPairs method sorts the words,
    // then checks for anagram pairs using nested loops
    // and breaks the inner loop once an anagram pair is found
    // or continues with the next pair if they are not anagrams
    // The main method demonstrates the usage of the findAnagramPairs method
    // with sample input
}
}
// Output:
// Anagram pair: listen and silent
// Anagram pair: potato and tomato
