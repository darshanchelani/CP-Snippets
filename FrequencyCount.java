// FrequencyCount.java
// Count frequency of characters in a string
// 
// Concept:
//   Frequency counting = tally occurrences of each character.
//   Useful for:
//     - Anagram checks
//     - Character balancing
//     - String comparison problems
//
//   Example: "ABCDEDBBS" -> 
//       A=1, B=3, C=1, D=2, E=1, S=1
//
//   Time Complexity: O(n)
//   Space Complexity: O(1) if 26 fixed letters (constant array size)

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        String s = "ABCDEDBBS";  // Input string we want to analyze

        int[] freq = new int[26];  
        // Array for uppercase letters A-Z (26 slots, default initialized to 0)
        // We'll map character 'A' -> index 0, 'B' -> index 1, ..., 'Z' -> index 25

        // Step 1: Iterate through every character of the string
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;  // Compute index and increment frequency
            // Example: if c = 'B', then index = 'B'-'A' = 1. So freq[1]++.
        }

        // Step 2: Print results
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {  // Only print letters that actually appear
                System.out.println((char) ('A' + i) + " -> " + freq[i]);
                // (char)('A' + i) turns index back into the corresponding letter
            }
        }
    }
}