package com.methods;

public class maxmin {
    public static void main(String[] args) {
        System.out.println("Maximum of three numbers:"+Maximum(14,11,29));
        System.out.println("Minimum of three numbers:"+Minimum(14,11,29));

    }
    static int  Maximum(int n1,int n2,int n3){
        int Max=Math.max(n3,Math.max(n1,n2));
        return Max;
    }
    static int  Minimum(int n1,int n2,int n3){
        int Min=Math.min(n3,Math.min(n1,n2));
        return Min;
    }
}
