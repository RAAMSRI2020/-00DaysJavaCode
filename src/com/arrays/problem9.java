package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class problem9 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet=new HashSet<>();

        for(int i='a';i<='z';i++){
            alphabetSet.add((char)i);
        }

        for(int i=0;i<sentence.length();i++){
            alphabetSet.remove(sentence.charAt(i));
            if(alphabetSet.isEmpty())
                return true;
        }
        return false;
    }
}
