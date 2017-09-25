package com.bvan.javastart.lesson8.hw;

/**
 * @author bvanchuhov
 */
public class Task8 {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2000},
                {500, 400, 0}
        };

        int maxRow = maxSumRowIndex(matrix);

        System.out.println(maxRow); // 2
    }

    public static int maxSumRowIndex(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("empty matrix");
        }

        int resIndex = 0;
        int maxSum = sum(matrix[0]);

        for (int i = 1; i < matrix.length; i++) {
            int sum = sum(matrix[i]);

            if (maxSum < sum) {
                resIndex = i;
                maxSum = sum;
            }
        }

        return resIndex;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
