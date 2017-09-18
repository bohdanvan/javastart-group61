package com.bvan.javastart.lesson6.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author bvanchuhov
 */
public class ArrayRandomFiller {

    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
