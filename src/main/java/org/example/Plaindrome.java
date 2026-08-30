package org.example;

public class Plaindrome {

    public boolean isPlaindrome(String str){
        String reverseString="";
        for(int i=str.length()-1;i>=0;i--){
            reverseString=reverseString+str.charAt(i);
        }
//        if (str.equals(reverseString)){
//            return true;
//        }
//        else{
//            return false;
//        }
        return str.equals(reverseString);
    }
}
