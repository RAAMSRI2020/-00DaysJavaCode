package com.conditionalsLoops;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any character:");
        String ch=sc.next().toLowerCase();
        if(ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u"){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
