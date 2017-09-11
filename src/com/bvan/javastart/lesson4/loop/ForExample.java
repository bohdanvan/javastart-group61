package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // n = 1..10
        for (int n = 1; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 10..1
        for (int n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 2, 4, 6, ... 40
        for (int n = 2; n <= 40; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
