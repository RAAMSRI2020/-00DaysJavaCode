package com.javaBasics;

import java.util.Scanner;

public class infinteSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        String str="x";
        do{
            System.out.println("Enter any number:");
            n=sc.nextInt();
            sum+=n;
        }while(n!=0);
        System.out.println(sum);
    }
}
