package com.conditionalsLoops;

import java.util.Scanner;

public class avgMarks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5,avg;
        System.out.println("Enter the marks of five subjects(out of 100):");
        sub1= sc.nextFloat();
        sub2= sc.nextFloat();
        sub3= sc.nextFloat();
        sub4= sc.nextFloat();
        sub5= sc.nextFloat();
        avg=(sub2+sub1+sub3+sub4+sub5)/5;
        System.out.println("Average marks:"+avg);

    }
}
