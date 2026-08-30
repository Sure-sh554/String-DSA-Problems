package org.example;

public class CountOccurrences {
    public static void main(String[] args) {
        String str="Suresh";
        char target='s';
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times");

    }
}
