package com.conditionalsLoops;
public class prodSumdiff {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
        static int subtractProductAndSum(int n) {
            int prod=1,sum=0,digit;
            while(n!=0){
                digit=n%10;
                prod*=digit;
                sum+=digit;
                n/=10;
            }
            return (prod-sum);
        }
    }

