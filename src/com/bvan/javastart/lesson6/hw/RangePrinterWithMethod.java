package com.bvan.javastart.lesson6.hw;

/**
 * @author bvanchuhov
 */
public class RangePrinterWithMethod {

    public static void main(String[] args) {
        printRange(10, 20);
        printRange(30, 25);
        printRange(15, 15);
    }

    public static void printRange(int first, int last) {
        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int j = first; j >= last; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
