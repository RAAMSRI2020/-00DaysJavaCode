package com.methods;

import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int n= sc.nextInt();
        System.out.println("sum of terms:"+naturalNumbers(n));
    }
    static int naturalNumbers(int n){
        return(n*(n+1))/2;
    }
}
