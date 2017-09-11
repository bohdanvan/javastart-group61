package com.bvan.javastart.lesson4.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class FunctionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double res = Math.log(Math.sin(x) + Math.exp(x) * Math.sqrt(x) / Math.PI);

        System.out.println("res = " + res);
    }
}
