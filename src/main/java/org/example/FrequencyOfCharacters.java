package org.example;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="banana";

        Map<Character,Integer> freqChar=new HashMap<>();

        char [] freqArray =str.toCharArray();
        for(char ch:freqArray){
            freqChar.put(ch,freqChar.getOrDefault(ch,0)+1);
        }
        System.out.println(freqChar);

    }
}
