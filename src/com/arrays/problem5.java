package com.arrays;

import java.util.Arrays;

public class problem5 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(array,3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];
        for (int i = 0; i < n; i++) {
            shuffledArray[2 * i] = nums[i]; // x_i
            shuffledArray[2 * i + 1] = nums[i + n]; // y_i
        }
        return shuffledArray;
    }
}
