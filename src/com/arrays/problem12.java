package com.arrays;

public class problem12 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = flipAndInvertImage(array);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {  // Corrected the loop variable
                System.out.println(result[i][j]);
            }
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - j - 1] ^ 1;
                image[i][n - j - 1] = temp;
            }
        }
        return image;
    }
}
