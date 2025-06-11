package chowdeswari;
import java.util.Arrays;

public class AlphabeticalSort {
    public static void main(String[] args) {
        // Define an array of strings
        String[] words = { "banana", "apple", "grape", "cherry", "mango" };

        // Sort the array alphabetically
        Arrays.sort(words);

        // Print the sorted array
        System.out.println("Strings in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
