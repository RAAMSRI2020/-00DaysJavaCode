package com.conditionalsLoops;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float price,disPercentage;
        System.out.println("Enter price and discountpercentage");
        price= sc.nextFloat();
        disPercentage=sc.nextFloat();
        System.out.println("Discount Mount:"+(price)*(disPercentage*0.01));
    }
}
