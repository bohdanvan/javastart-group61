package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    // Client
    public static void main(String[] args) {
        int x = min(60, 40) + min(10, 100);
        System.out.println(x);
    }

    // Creator
    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
