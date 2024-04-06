package com.methods;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Odd or even using bitwise or operator:"+oddEvenBitwiseOr(5));
        System.out.println("Odd or even using bitwise and operator:"+oddEvenBitwiseAnd(8));
        System.out.println("Odd or even using bitwise xor operator:"+oddEvenBitwiseXor(9));

    }
    static String oddEvenBitwiseOr(int n){
        if((n|1)>n){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    static String oddEvenBitwiseAnd(int n){
        if((n&1)==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    static String oddEvenBitwiseXor(int n){
        if((n^1)==n+1){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
