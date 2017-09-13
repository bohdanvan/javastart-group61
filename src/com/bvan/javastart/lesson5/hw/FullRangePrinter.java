package com.bvan.javastart.lesson5.hw;

/**
 * @author bvanchuhov
 */
public class FullRangePrinter {

    public static void main(String[] args) {
        int from = 0;
        int to = 0;

        if (from < to) {
            for (int n = from; n <= to; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        } else {
            for (int n = from; n >= to; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
