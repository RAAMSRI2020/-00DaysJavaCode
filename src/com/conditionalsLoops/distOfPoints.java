package com.conditionalsLoops;

import java.util.Scanner;

public class distOfPoints {
    public static void main(String[] args) {
        float x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2");
        x1= sc.nextFloat();
        y1= sc.nextFloat();
        x2= sc.nextFloat();
        y2= sc.nextFloat();
        double dist=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println(dist);
    }
}
