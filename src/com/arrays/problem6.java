package com.arrays;
import java.util.List;
import java.util.ArrayList;

public class problem6 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        System.out.println(kidsWithCandies(array,3));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        for (int kid : candies) {
            maxCandies = Math.max(maxCandies, kid);
        }

        List<Boolean> result = new ArrayList<>();
        for (int kid : candies) {
            result.add(kid + extraCandies >= maxCandies);
        }

        return result;
    }}
