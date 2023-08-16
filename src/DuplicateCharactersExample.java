import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersExample {
    public static void main(String[] args) {
        // Finding duplicate characters in a string
        String inputString = "programming";
        findAndPrintDuplicates(inputString);

        // Finding duplicate characters in an array of strings
        String[] stringArray = { "apple", "banana", "grape", "apple", "orange" };
        for (String str : stringArray) {
            System.out.println("\nFinding duplicates in: " + str);
            findAndPrintDuplicates(str);
        }
    }

    public static void findAndPrintDuplicates(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Populate the character frequency map
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        System.out.print("Duplicate characters: ");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}
