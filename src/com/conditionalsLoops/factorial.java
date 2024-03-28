package com.conditionalsLoops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n= sc.nextInt();
        int fact=1;
        if(n==0||n==1){
            System.out.println(1);
        }
        else{
            for(int i=n;i>=1;i--){
               fact*=i;
            }
            System.out.println(fact);

        }
    }
}
