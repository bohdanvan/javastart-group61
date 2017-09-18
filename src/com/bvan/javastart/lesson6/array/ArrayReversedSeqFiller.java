package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReversedSeqFiller {

    public static void main(String[] args) {
        int[] array = new int[10];

        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler--;
        }

        System.out.println(Arrays.toString(array));
    }
}
