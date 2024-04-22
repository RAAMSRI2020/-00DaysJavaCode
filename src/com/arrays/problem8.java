package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem8 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int[]nums1={0,1,2,3,4,5};
        System.out.println(Arrays.toString(createTargetArray(nums,nums1)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(index[i],nums[i]);
        int[] res=new int[nums.length];
        for(int i=0;i<list.size();i++)
            res[i]=list.get(i);
        return res;
    }
}
