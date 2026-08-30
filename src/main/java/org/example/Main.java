package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ReverseString reverseString=new ReverseString();
//        reverseString.reverseString("Suresh");

        Plaindrome plaindrome=new Plaindrome();
       boolean plaindromeoutput= plaindrome.isPlaindrome("madam");
       System.out.println(plaindromeoutput);
    }
}