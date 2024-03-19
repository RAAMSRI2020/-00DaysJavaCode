package com.javaBasics;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n=sc.nextInt();
        int n1=-1,n2=1;
        for(int i=0;i<n;i++){
            int fibo=n1+n2;
            System.out.print(fibo+" ");
            n1=n2;
            n2=fibo;
        }
    }
}
