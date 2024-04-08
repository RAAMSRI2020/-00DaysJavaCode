package com.methods;

import java.util.Scanner;

public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Addition of two numbers:"+add(n1,n2));
        System.out.println("Product of two numbers:"+pdt(n1,n2));

    }
    static int add(int n1,int n2){
        return (n1+n2);
    }
    static int sub(int n1,int n2){
        return (n1-n2);
    }
    static int pdt(int n1,int n2){
        return (n1*n2);
    }
    static int div(int n1,int n2){
        return (n1/n2);
    }
}
