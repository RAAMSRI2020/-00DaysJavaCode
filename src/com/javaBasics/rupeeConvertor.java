package com.javaBasics;
import java.util.Scanner;
public class rupeeConvertor {
    //0.01207
    public static void main(String[] args) {
        float rupee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees:");
        rupee=sc.nextFloat();
        float USD=rupee*0.01207f;
        System.out.println(rupee+" in USD :"+USD);

    }
}
