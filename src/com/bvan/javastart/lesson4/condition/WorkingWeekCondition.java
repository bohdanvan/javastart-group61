package com.bvan.javastart.lesson4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day of week (1..7): ");
        int day = scanner.nextInt();

        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Beer");
        }

        System.out.println("Java Courses");
    }
}
