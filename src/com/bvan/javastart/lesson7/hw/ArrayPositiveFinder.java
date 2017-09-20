package com.bvan.javastart.lesson7.hw;

/**
 * @author bvanchuhov
 */
public class ArrayPositiveFinder {

    public static void main(String[] args) {
        int[] array = new int[]{-1, 3, -12, 42, -8, -23};

//        int printFirst = findFirstPositiveElemIndex(array);
//        System.out.println("First index with positive number: " + printFirst);

        int printLast = findLastPositiveElemIndex(array);
        System.out.println("Last index with positive number: " + printLast);
    }


    public static int[] findTwoExtremeValuesIndex(int[] array) {

        int[] indexOfPositiveArray = new int[2];
        int doHaveFirstIndex = 0;
        for (int i = 0; i < array.length; i++) {

            // найти первое и последнее позетивное число

            if (array[i] > 0) {
                if (doHaveFirstIndex == 0) {
                    indexOfPositiveArray[0] = i;
                    doHaveFirstIndex = 1;
                }
                indexOfPositiveArray[1] = i;
            }

        }
        return indexOfPositiveArray;
    }

    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastPositiveElemIndex(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}
