package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayEvenCellsFiller {

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];

//        for (int i = 0; i < array.length; i += 2) {
//            array[i] = 10;
//        }
//        for (int i = 1; i < array.length; i += 2) {
//            array[i] = 20;
//        }

        for (int i = 0; i < array.length; i++) {
            array[i] = (i % 2 == 0) ? 10 : 20;
        }

        System.out.println(Arrays.toString(array));
    }
}
