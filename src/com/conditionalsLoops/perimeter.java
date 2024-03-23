package com.conditionalsLoops;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        String s="Y";
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Perimeter of Circle\n2.Area of Triangle\n" +
                    "3.Perimeter Of Rectangle\n "+
                    "4.Perimeter Of Square\n5.Perimeter Of Parallelogram\n6.Perimeter of Rhombus");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter radius:");
                    int radius=sc.nextInt();
                    System.out.println("Perimeter of Circle:"+(2*Math.PI*radius));
                    break;

                case 2:
                    System.out.println("Enter three sides:");
                    int side1=sc.nextInt();
                    int side2=sc.nextInt();
                    int side3=sc.nextInt();
                    System.out.println("Perimeter of Triangle:"+(side1+side2+side3));
                    break;

                case 3:
                    System.out.println("Enter length and breadth:");
                    int length=sc.nextInt();
                    int breadth=sc.nextInt();
                    System.out.println("Perimeter of rectangle:"+(2*(length+breadth)));
                    break;

                case 4:
                    System.out.println("Enter side:");
                    int side=sc.nextInt();
                    System.out.println("Perimeter of square:"+(4*side));
                    break;

                case 5:
                    System.out.println("Enter adjacent sides:");
                    int diagonal1=sc.nextInt();
                    int diagonal2=sc.nextInt();
                    System.out.println("Perimeter of Rhombus:"+(2*(diagonal2+diagonal1)));
                    break;
                case 6:
                    System.out.println("Enter side length:");
                    int side4=sc.nextInt();
                    System.out.println("Perimeter of Rhombus:"+(4*side4));
                    break;
                default:
                    System.out.println("Enter proper choice");
            }
            System.out.println("Do you want to continue(Y/N)");
            s=sc.next();
        }while("Y" == s);
    }
}
