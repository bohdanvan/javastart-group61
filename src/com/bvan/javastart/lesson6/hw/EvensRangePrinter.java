package com.bvan.javastart.lesson6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class EvensRangePrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        int first = sc.nextInt();
        System.out.print("Enter last: ");
        int last = sc.nextInt();

        if (first <= last) {

            if (first % 2 != 0) {
                first++;
            }
            for (int i = first; i <= last; i += 2) {
                System.out.println(i);
            }

        } else {
            System.out.println();
        }
    }
}
