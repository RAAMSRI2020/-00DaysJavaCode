package com.javaBasics;
import java.util.Scanner;
import java.lang.Integer;

public class infinteSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;String str;
        while(true){
            System.out.println("Enter any number(enter x to quit):");
            str=sc.next();
            try{
                int n=Integer.parseInt(str);
                sum+=n;
            }catch(NumberFormatException e){
                break;
            }

        }
        System.out.println("sum:"+sum);
    }
}
