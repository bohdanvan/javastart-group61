package com.bvan.javastart.lesson6.hw;

/**
 * @author bvanchuhov
 */
public class FactorialCalculator {

    public static void main(String[] args) {
        long factorial = factorial(-1);
        System.out.println("factorial = " + factorial);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative factorial arg: " + n);
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
