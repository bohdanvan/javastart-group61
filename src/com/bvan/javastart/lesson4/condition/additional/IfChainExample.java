package com.bvan.javastart.lesson4.condition.additional;

/**
 * @author bvanchuhov
 */
public class IfChainExample {

    public static void main(String[] args) {
        int itemType = 100;

        if (itemType == 0) {
            System.out.println("PC");
        } else if (itemType == 1) {
            System.out.println("Notebook");
        } else if (itemType == 2 || itemType == 3) {
            System.out.println("Phone");
        } else {
            System.out.println("Other"); // Default
        }
    }
}
