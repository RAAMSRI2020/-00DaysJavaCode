package com.methods;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5:"+factorial(5));
        System.out.println("Factorial of 0:"+factorial(5));

    }
    static int factorial(int n){
        int fact=1;
        if(n==0||n==1)
            return fact;
        else{
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            return fact;
        }
    }
}
