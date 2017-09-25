package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class RefAndContentEquals {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("ref: " + (s1 == s2));
        System.out.println("content: " + s1.equals(s2));
    }
}
