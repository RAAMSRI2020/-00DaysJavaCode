package com.arrays;

import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) {
        int[] array={0,1,2,3,4};
        System.out.println(Arrays.toString(runningSum(array)));
    }
    static int[] runningSum(int[] nums) {
        //int[] runningSum=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            // int sum=i;
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
