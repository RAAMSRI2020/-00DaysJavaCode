package com.javaBasics;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers:");
        num1= sc.nextInt();
        num2= sc.nextInt();
        System.out.println("The sum is:"+(num1+num2));
    }
}
