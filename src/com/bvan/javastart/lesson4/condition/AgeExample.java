package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class AgeExample {

    public static void main(String[] args) {
        int n = 10;

        if (n >= 1 && n <= 120) {
            System.out.println("Correct age");
        } else {
            System.out.println("Illegal age");
        }
    }
}
