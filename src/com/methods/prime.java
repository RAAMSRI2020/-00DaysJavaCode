package com.methods;

public class prime {
    public static void main(String[] args) {
        System.out.println("7 is "+IsPrime(IsPrimeCheck(7)));
        System.out.println("14 is "+IsPrime(IsPrimeCheck(14)));

    }
    static Boolean IsPrimeCheck(int n){
        if(n<=1)
            return false;

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    static String IsPrime(Boolean check){
        String prime=check?"prime":"not prime";
        return prime;
    }
}
