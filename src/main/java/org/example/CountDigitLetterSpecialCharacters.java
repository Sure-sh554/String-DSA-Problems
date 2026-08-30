package org.example;

public class CountDigitLetterSpecialCharacters {
    public static void main(String[] args) {
            String str="Java!@123#";

            int letters=str.replaceAll("[^a-zA-Z]","").length();
            int digits=str.replaceAll("[^0-9]","").length();
            int specialCharacters=str.
                    replaceAll("[a-zA-Z0-9]","").length();
            System.out.println(letters);
            System.out.println(digits);
            System.out.println(specialCharacters);
    }
}
