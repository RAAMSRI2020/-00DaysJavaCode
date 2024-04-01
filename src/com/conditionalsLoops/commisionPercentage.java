package com.conditionalsLoops;

import java.util.Scanner;

public class commisionPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount:");
        double amount= sc.nextDouble();
        System.out.println("Enter commission percentage:");
        double percentage= sc.nextDouble();
        double commision=(percentage/100)*amount;
        System.out.println("Commission amount:"+commision);
    }
}
