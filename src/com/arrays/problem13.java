package com.arrays;

public class problem13 {
    public static void main(String[] args) {

    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        // Apply increment operations
        for (int[] index : indices) {
            int ri = index[0];
            int ci = index[1];
            // Increment row ri
            for (int j = 0; j < n; j++) {
                matrix[ri][j]++;
            }
            // Increment column ci
            for (int i = 0; i < m; i++) {
                matrix[i][ci]++;
            }
        }

        // Count odd-valued cells
        int oddCount = 0;
        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell % 2 == 1) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
