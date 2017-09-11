package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class AgeValidation {

    public static void main(String[] args) {
        int age = 1000;

        if (age < 1 || age > 120) {
            System.out.println("Illegal age");
            System.exit(0);
        }

        System.out.println("My age is " + age);
    }
}
