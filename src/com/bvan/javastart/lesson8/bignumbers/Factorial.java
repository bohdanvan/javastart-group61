package com.bvan.javastart.lesson8.bignumbers;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class Factorial {

    public static void main(String[] args) {
        BigInteger factorial = factorial(1000);
        System.out.println(factorial);
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative factorial arg: " + n);
        }

        BigInteger res = BigInteger.ONE; // res = 1
        for (int i = 2; i <= n; i++) {
            BigInteger current = BigInteger.valueOf(i);

            res = res.multiply(current); // res *= i
        }

        return res;
    }
}
