package com.conditionalsLoops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        n2=Math.max(n1,n2);
        int temp;
        while(n2>0){
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("HCF:"+n1);
    }
}
