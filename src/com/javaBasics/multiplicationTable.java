package com.javaBasics;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        System.out.println("==================");
        for(int i=1;i<10;i++){
          System.out.println(n+" X "+i+" = "+(n*i));
        }
        System.out.println("==================");

    }
}
