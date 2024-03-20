package com.conditionalsLoops;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        String s="Y";
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Area of Circle\n2.Area of Triangle\n" +
                    "3.Area Of Rectangle\n "+
                    "4.Area Of Rhombus\n5.Area Of Parallelogram");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter radius:");
                    int radius=sc.nextInt();
                    System.out.println("Area of Circle:"+(Math.PI*radius*radius));
                    break;

                case 2:
                    System.out.println("Enter base and height:");
                    int base=sc.nextInt();
                    int height=sc.nextInt();
                    System.out.println("Area of Triangle:"+(0.2*base*height));
                    break;

                case 3:
                    System.out.println("Enter length and breadth:");
                    int length=sc.nextInt();
                    int breadth=sc.nextInt();
                    System.out.println("Area of rectangle:"+(length*breadth));
                    break;

                case 4:
                    System.out.println("Enter base and height:");
                    int height1=sc.nextInt();
                    int breadth1=sc.nextInt();
                    System.out.println("Area of Parallelogram:"+(breadth1*height1));
                    break;

                case 5:
                    System.out.println("Enter diagonal1 and diagonal2:");
                    int diagonal1=sc.nextInt();
                    int diagonal2=sc.nextInt();
                    System.out.println("Area of Rhombus:"+(0.5*diagonal2*diagonal1));
                    break;

                default:
                    System.out.println("Enter proper choice");
            }
            System.out.println("Do you want to continue(Y/N)");
            s=sc.next();
        }while("Y" == s);
    }
}
