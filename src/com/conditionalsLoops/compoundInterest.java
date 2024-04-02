package com.conditionalsLoops;
import java.util.Scanner;

public class compoundInterest {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input principal amount
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            // Input annual interest rate
            System.out.print("Enter the annual interest rate (in percentage): ");
            double rate = scanner.nextDouble() / 100.0;

            // Input time (in years)
            System.out.print("Enter the time (in years): ");
            double time = scanner.nextDouble();

            // Calculate compound interest
            double compoundInterest = principal * Math.pow(1 + rate, time) - principal;

            // Display the result
            System.out.println("Compound Interest: " + compoundInterest);
        }
    }


