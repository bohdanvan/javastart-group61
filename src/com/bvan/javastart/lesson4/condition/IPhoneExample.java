package com.bvan.javastart.lesson4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        if (money >= 998) {
            System.out.println("Buy iPhone 8");
        }

        System.out.println("Beer");
    }
}
