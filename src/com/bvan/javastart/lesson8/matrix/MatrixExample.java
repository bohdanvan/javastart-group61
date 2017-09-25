package com.bvan.javastart.lesson8.matrix;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int elem = matrix[2][3];
        System.out.println(elem);

        MatrixUtils.printMatrix(matrix);
    }
}
