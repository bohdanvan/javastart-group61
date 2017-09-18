package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayWithYears {

    public static void main(String[] args) {
        int size = 18;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2000;
        }

        System.out.println(Arrays.toString(array));
    }
}
