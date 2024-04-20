package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class problem7 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buckets = new int[102];

        // Get frequency of each element
        for (int num : nums) {
            buckets[num]++;
        }

        // Count smaller numbers than each element
        for (int i = 1; i < buckets.length; i++) {
            buckets[i] += buckets[i - 1];
        }

        // Populate the result
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0)
                result[i] = 0;
            else
                result[i] = buckets[nums[i] - 1];
        }

        return result;
    }
}
