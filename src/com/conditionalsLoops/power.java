package com.conditionalsLoops;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and exponent:");
        double base= sc.nextInt();
        double exp= sc.nextInt();
        double power=Math.pow(base,exp);
        System.out.println(power);
    }
}
