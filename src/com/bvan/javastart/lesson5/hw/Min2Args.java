package com.bvan.javastart.lesson5.hw;

/**
 * @author bvanchuhov
 */
public class Min2Args {

    public static void main(String[] args) {
        // Input
        int a = 10;
        int b = 10;

        // BL
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        // Output
        System.out.println("min = " + min);
    }
}
