package com.methods;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and age:");
        String name= sc.next();
        int age= sc.nextInt();
        if(IsEligible(age)){
            System.out.println(name+" is eligible to vote");
        }
        else{
            System.out.println("Oops!"+name+" is not eligible to vote");

        }
    }
    static Boolean IsEligible(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
