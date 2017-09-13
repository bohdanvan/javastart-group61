package com.bvan.javastart.lesson5.triangle;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        // Validate size
        if (size <= 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        for (int count = 1; count <= size; count++) {
            for (int n = 1; n <= count; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
