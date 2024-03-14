package com.javaBasics;
import java.util.Scanner;
public class lcmGcd {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int Max=Math.max(n1,n2);
        int lcm=1,gcd=1;
        for(int i=1;i<Max;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        lcm=(n1*n2)/gcd;
        System.out.println("The LCM and GCD of entered numbers are :"+lcm+" "+gcd);

    }
}
