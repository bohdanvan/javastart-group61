package com.bvan.javastart.lesson8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class NamesExample {

    public static void main(String[] args) {
        String[] names = {
                "Taras",
                "Ivan",
                "Natalya"
        };

        char c = names[1].charAt(3);
        System.out.println(c);

        System.out.println(Arrays.toString(names));
    }
}
