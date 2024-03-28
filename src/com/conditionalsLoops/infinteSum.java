package com.conditionalsLoops;

import java.util.Scanner;

public class infinteSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int positiveSum=0,negativeSum=0;
        while(true){
            int n= sc.nextInt();
            if(n>0){
                positiveSum+=n;
            }
            else if(n<0){
                negativeSum+=n;
            }
            else if(n==0){
                break;
            }
        }
        System.out.println("Positive Sum:"+positiveSum);
        System.out.println("Negative Sum:"+negativeSum);
    }
}
