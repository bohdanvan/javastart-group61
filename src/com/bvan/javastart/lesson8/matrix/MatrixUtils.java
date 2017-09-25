package com.bvan.javastart.lesson8.matrix;

/**
 * @author bvanchuhov
 */
public class MatrixUtils {

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
            return;
        }

        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (int elem : array) {
            String s = String.format("%-5s", elem);
            System.out.print(s);
        }
        System.out.println();
    }
}
