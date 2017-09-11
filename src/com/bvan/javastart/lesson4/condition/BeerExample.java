package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class BeerExample {

    public static void main(String[] args) {
        boolean goodBeer = false;
        boolean expensiveBeer = true;

        if (goodBeer || !expensiveBeer) {
            System.out.println("Buy beer");
        }
    }
}
