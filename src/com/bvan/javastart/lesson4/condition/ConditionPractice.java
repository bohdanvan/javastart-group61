package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class ConditionPractice {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 40;

        boolean b1 = (x > y) && (z < y) || x != y;
        System.out.println(b1);

        boolean b2 = (false && true || !false && true) || true && !false;
        System.out.println(b2);
    }
}
