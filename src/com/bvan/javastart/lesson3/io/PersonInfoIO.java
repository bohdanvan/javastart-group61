package com.bvan.javastart.lesson3.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        // 1. Create Scanner object
        Scanner scan = new Scanner(System.in);

        // 2. Read string and int
        System.out.println("Enter name: ");
        String name = scan.next();

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        // 3. Close Scanner (optional)
        scan.close();

        // BL
        String message = "Hello, I'm " + name + ", " + age + " years old";

        // Output
        System.out.println(message);
    }
}
