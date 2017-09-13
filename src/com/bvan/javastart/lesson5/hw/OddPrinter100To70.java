package com.bvan.javastart.lesson5.hw;

/**
 * @author bvanchuhov
 */
public class OddPrinter100To70 {

    public static void main(String[] args) {
        for (int n = 99; n > 70; n -= 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        // BAD
        for (int n = 100; n >= 70; n--) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
