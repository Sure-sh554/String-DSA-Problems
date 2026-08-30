package org.example;

public class ReverseString {
//    public ReverseString(String suresh) {
//    }

    public String reverseString(String str) {
        // char[] strArray =str.toCharArray();
        String newReverseString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newReverseString = newReverseString + str.charAt(i);

        }
        System.out.println(newReverseString);

//        StringBuilder stringBuilder =new StringBuilder(str);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);
        return newReverseString;
    }
}
