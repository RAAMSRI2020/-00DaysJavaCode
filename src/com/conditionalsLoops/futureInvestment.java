package com.conditionalsLoops;
import java.util.Scanner;

public class futureInvestment {


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter present value: ");
            double p = sc.nextDouble();

            System.out.print("Enter the interest rate: ");
            double r = sc.nextDouble();

            System.out.print("Enter the time period in years: ");
            double y = sc.nextDouble();

            double f = p * Math.pow((1 + r / 100), y);
            System.out.println("Future investment value is: " + f);
        }
    }


