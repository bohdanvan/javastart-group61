package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile {

    public static void main(String[] args) {
        int day = 1; // init value
        while (day <= 5) { // loop condition
            System.out.println(day + " - Work");
            day++; // increment
        }
        System.out.println("Beer");
    }
}
