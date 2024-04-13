package com.methods;

public class nPrime {
    public static void main(String[] args) {
        int start = 20, end = 50;
        displayPrimeNumbers(start, end);
    }

    static void displayPrimeNumbers(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
