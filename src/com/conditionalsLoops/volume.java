package com.conditionalsLoops;

import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        /*Volume Of Cone Java Program
        15. Volume Of Prism
        16. Volume Of Cylinder
        17. Volume Of Sphere
        18. Volume Of Pyramid
        19. Curved Surface Area Of Cylinder
        20. Total Surface Area Of Cube*/
        String s="Y";
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Volume of Cone\n2.Volume of Prism\n" +
                    "3.Volume of Cylinder\n "+
                    "4.Volume of Sphere\n5.Volume of Pyramid\n6.CSA of Cylinder\n7.TSA of Cube");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter radius and height");
                    int rad = sc.nextInt();
                    int height = sc.nextInt();
                    System.out.println("Volume of cone " + (0.3 * Math.PI * rad * rad * height));
                    break;

                case 2:
                    System.out.println("Enter apolength,base,height");
                    int apol = sc.nextInt();
                    int base = sc.nextInt();
                    int height1=sc.nextInt();
                    System.out.println("Volume of Prism " + (0.5 *apol*base*height1));
                    break;

                case 3:
                    System.out.println("Enter radius and height");
                    int rad1 = sc.nextInt();
                    int height2 = sc.nextInt();
                    System.out.println("Volume of Cylinder " + (Math.PI * rad1 * rad1 * height2));
                    break;

                case 4:
                    System.out.println("Enter radius");
                    int rad2 = sc.nextInt();
                    System.out.println("Volume of Sphere " + (Math.PI * rad2 * rad2 * rad2));
                    break;

                case 5:
                    System.out.println("Enter area and height");
                    int area = sc.nextInt();
                    int height3 = sc.nextInt();
                    System.out.println("Volume of Pyramid " + (0.3 *area* height3));
                    break;

                case 6:
                    System.out.println("Enter radius and height");
                    int rad3 = sc.nextInt();
                    int height4 = sc.nextInt();
                    System.out.println("CSA of Cylinder " + (2* Math.PI * rad3 *height4));
                    break;

                case 7:
                    System.out.println("Enter side");
                    int side=sc.nextInt();
                    System.out.println("TSA of cube "+(6*side*side));
                    break;

                default:
                    System.out.println("Enter proper choice");
            }
            System.out.println("Do you want to continue(Y/N)");
            s=sc.next().toUpperCase();
        }while (s=="N");
    }
}
