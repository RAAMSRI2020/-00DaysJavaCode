package com.methods;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
    static boolean checkPalindrome(int n)
    {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
}}
