package com.arrays;

import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {
        int [][] array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maximumWealth(array));
    }
    static int maximumWealth(int[][] accounts) {
        int maxwealth=Integer.MIN_VALUE;
        for(int customers[]:accounts){
            int totalwealth=0;
            for(int account:customers){
                totalwealth+=account;
            }
            maxwealth=Math.max(totalwealth,maxwealth);
        }
        return maxwealth;

    }
}
