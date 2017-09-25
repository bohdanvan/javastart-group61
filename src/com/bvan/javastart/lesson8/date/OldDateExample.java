package com.bvan.javastart.lesson8.date;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class OldDateExample {

    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(0);
        System.out.println(date2);

        Date date3 = new Date(Long.MAX_VALUE);
        System.out.println(date3);
    }
}
