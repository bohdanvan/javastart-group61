package com.bvan.javastart.lesson5.hw;

/**
 * @author bvanchuhov
 */
public class Min3Args {

    public static void main(String[] args) {
        // Input
        int a = 30;
        int b = 10;
        int c = 5;

        // BL
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        if (min > c) {
            min = c;
        }

        // Output
        System.out.println("min = " + min);
    }
}
