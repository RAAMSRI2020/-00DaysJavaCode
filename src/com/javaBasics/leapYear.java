package com.javaBasics;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any year:");
        int year= sc.nextInt();
        String Isleap=year%4==0?" Leap year":" Not a Leap Year";
        System.out.println(year +"is "+Isleap);

    }
}
