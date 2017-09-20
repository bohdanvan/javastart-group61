package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class Ages {

    public static void main(String[] args) {
        boolean x = isAge(30);
        System.out.println(x); // true

        boolean y = isAge(1000);
        System.out.println(y); // false

        int[] array1 = {50, 25, 45};
        System.out.println(isAges(array1)); // true

        int[] array2 = {50, -10, 30};
        System.out.println(isAges(array2)); // false

        System.out.println(averageAge(array1)); // 40
    }

    public static int averageAge(int[] ages) {
        if (ages.length == 0) {
            throw new IllegalStateException("can't calculate average for empty array");
        }
        if (!isAges(ages)) {
            throw new IllegalStateException("this is not an ages array");
        }

        int agesSum = 0;
        for (int age : ages) {
            agesSum += age;
        }

        return agesSum / ages.length;
    }

    public static boolean isAges(int[] array) {
        for (int elem : array) {
            if (!isAge(elem)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Age is a number between 1 and 120.
     */
    public static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }
}
