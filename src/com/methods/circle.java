package com.methods;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius=sc.nextDouble();
        System.out.println("Area of circle:"+area(radius));
        System.out.println("Circumference  of circle:"+circumference(radius));

    }
    static double circumference(double r){
        return (2*Math.PI*r);
    }
    static double area(double r){
        return (Math.PI*r*r);
    }
}
