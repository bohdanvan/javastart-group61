package com.bvan.javastart.lesson6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class FilledMatrixPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        System.out.print("Enter filler: ");
        int filler = sc.nextInt();
        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("It's not a valid number");
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(filler + " ");
            }
            System.out.println();
        }
    }
}
