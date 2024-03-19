package com.javaBasics;
import java.util.Scanner;
public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str1=sc.next();
        String str2="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            str2=ch+str2;
        }
        //System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
