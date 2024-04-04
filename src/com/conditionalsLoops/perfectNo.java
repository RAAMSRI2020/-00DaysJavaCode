package com.conditionalsLoops;

import java.util.Scanner;

public class perfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no:");
        int n=sc.nextInt();
        int perfect=0;
        for (int i = 1; i <n-1 ; i++) {
            if(n%i==0)
                perfect+=i;
        }
        if(n==perfect){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
