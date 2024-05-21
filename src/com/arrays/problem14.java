package com.arrays;

public class problem14 {
    public static void main(String[] args) {
        int[][] mat= {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int len=mat.length;
        // System.out.print(len);
        int sum=0;
        for(int row=0;row<len;row++){
            sum+=mat[row][row];
        }
        for(int i=0;i<len;i++){
            if(i==(len-i-1))
                continue;
            sum+=mat[i][len-i-1];
        }
        // System.out.print(sum);
        return sum;

    }
}
