package com.bvan.javastart.lesson5.hw;

/**
 * @author bvanchuhov
 */
public class EvenPrinter1To50 {

    public static void main(String[] args) {
        for (int n = 2; n <= 50; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
