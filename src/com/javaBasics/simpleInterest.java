package com.javaBasics;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float principleAmount,rate,SI;int time;
        System.out.println("Enter principle amount:");
        principleAmount=sc.nextFloat();
        System.out.println("Enter time:");
        time=sc.nextInt();
        System.out.println("Enter rate:");
        rate=sc.nextFloat();
        SI=(principleAmount*time*rate)*0.01f;
        System.out.println("Simple Interest :"+SI);


    }
}
