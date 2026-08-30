package org.example;

import java.util.HashMap;
import java.util.Map;

public class LeastFrequentCharacter {
    public static void main(String[] args) {

        String str = "banana";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()
        ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        char mostFrequent = '\0';
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent character: " + mostFrequent);
        System.out.println("Frequency: " + minCount);
    }
}
