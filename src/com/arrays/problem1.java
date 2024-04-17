package com.arrays;

import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        System.out.println(Arrays.toString(nums));
    }
    static int[] buildArray(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }
}

