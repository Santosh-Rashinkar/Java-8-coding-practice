package com.prowings;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count the occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return i; // Return the index
            }
        }

        return -1; // Return -1 if there are no non-repeating characters
    }

    public static void main(String[] args) {
        String input = "abcdeabf";
        System.out.println("repetated charactors count is : "+ firstNonRepeatingChar(input)); // Output: 0
    }
}
