package com.javaBasics;
import java.util.Scanner;
public class arithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        char op;
        System.out.println("Enter two numbers:");
        n1 =sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Enter any one operator(+,-,*,/)");
        op=sc.next().charAt(0);
        if (op == '+') {
            System.out.println("Sum of numbers:"+(n1+n2));

        }
        else if (op == '-') {
            System.out.println("Difference of numbers:"+(n1-n2));

        }
        else if (op == '*') {
            System.out.println("Product of numbers:"+(n1*n2));

        }
        else if (op == '/') {
            try{
            System.out.println("Division of numbers:"+(n1/n2));}
            catch (Exception e){
                System.out.println("0 is not allowed");
            }

        }
    }
}
