package com.methods;

import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        System.out.println(IspythagoreanTriplet(n1,n2,n3));
    }
    static Boolean IspythagoreanTriplet(int n1,int n2,int n3){
        if((n1*n1)+(n2*n2)==(n3*n3))
            return true;
        return false;
    }
}
