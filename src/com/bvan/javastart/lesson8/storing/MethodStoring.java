package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class MethodStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int s = sum(x, y);
        System.out.println(s);
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
