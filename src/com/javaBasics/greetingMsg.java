package com.javaBasics;

import java.util.Scanner;

public class greetingMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name =sc.nextLine();
        System.out.println("welcome "+name+" to Java");
    }
}
