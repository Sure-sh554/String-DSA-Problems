package org.example;

public class CountVowelsAndConstants {
    public static void main(String[] args) {
        String str = "sureshoiecd";

        int vowelsCount = 0;
        int constansCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                    ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {
                vowelsCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                constansCount++;
            }
        }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + constansCount);

        int vowels = str.replaceAll("[^aeiouAEIOU]", "").length();
        int constants = str.replaceAll("[^a-zA-Z]", "").
                replaceAll("[aeiouAEIOU]", "").length();
        System.out.println(vowels);
        System.out.println(constants);

    }
}
