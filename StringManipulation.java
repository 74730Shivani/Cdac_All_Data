import java.util.HashMap;
import java.util.Map;

public class StringManipulation {

    // Method to reverse the string
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Method to count the number of repeated characters
    public static int countRepeatedCharacters(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Count the number of characters with a frequency greater than 1
        int repeatedCount = 0;
        for (int count : frequencyMap.values()) {
            if (count > 1) {
                repeatedCount++;
            }
        }
        
        return repeatedCount;
    }

    public static void main(String[] args) {
        String inputString = "aabbccdd";
        
        // Reverse the string
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
        
        // Count the number of repeated characters
        int repeatedCount = countRepeatedCharacters(inputString);
        System.out.println("Number of Repeated Characters: " + repeatedCount);
    }
}
