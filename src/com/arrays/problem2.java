package com.arrays;

import java.util.Arrays;

public class problem2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(Arrays.toString(getConcatenation(array)));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+(nums.length)]=nums[i];
        }
        return ans;
    }

}
