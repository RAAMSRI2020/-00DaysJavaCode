package com.conditionalsLoops;
import java.util.Scanner;
public class maxN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        while(true){
            System.out.println("Enter any number:");
            int n= sc.nextInt();
            if(n>max){
                max=n;
            }
            else if(n==0){
                break;
            }
        }
        System.out.println("Maximum of n numbers:"+max);
    }
}
