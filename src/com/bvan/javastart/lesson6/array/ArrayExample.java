package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size]; // Create array

        array[1] = 5;

        int lastIndex = array.length - 1;
        array[lastIndex] = 10;

        int length = array.length; // Get length
        System.out.println("length = " + length);

        System.out.println(Arrays.toString(array)); // Print array
    }
}
