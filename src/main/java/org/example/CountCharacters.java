package org.example;

public class CountCharacters {

    public static void main(String[] args) {
        String str="asssdergerfrfqerg34g";
        int count =0;
        char [] charArray =str.toCharArray();
        for(char c: charArray){
            count++;
        }
        System.out.println(count);

    }

}
