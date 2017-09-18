package com.bvan.javastart.lesson6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        int first = sc.nextInt();
        System.out.print("Enter last: ");
        int last = sc.nextInt();

        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.println(i);
            }
        } else {
            for (int j = first; j >= last; j--) {
                System.out.println(j);
            }
        }
    }
}
