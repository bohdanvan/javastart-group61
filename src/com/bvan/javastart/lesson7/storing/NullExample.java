package com.bvan.javastart.lesson7.storing;

/**
 * @author bvanchuhov
 */
public class NullExample {

    public static void main(String[] args) {
        String s = null;
        if (s != null) {
            int length = s.length();
            System.out.println(length);
        }
    }
}
