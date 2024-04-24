package com.arrays;

public class problem11 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(largestAltitude(array));
    }
    static int largestAltitude(int[] gain) {
        int max=0;
        int current=0;
        for(int i=0;i<gain.length;i++){
            current+=gain[i];
            max=Math.max(current,max);
        }
        return max;

    }
}
