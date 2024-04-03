package com.conditionalsLoops;

import java.util.Scanner;

public class numberPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int digit,rev=0,temp=n;
        while(n!=0){
            digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        if(rev==temp){
            System.out.println("Entered number is a palindrome");
        }
        else{
            System.out.println("Entered number is not a palindrome");

        }
    }
}
