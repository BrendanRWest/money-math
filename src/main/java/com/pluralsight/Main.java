package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float money1 = 0;
        double money2 = 0;
        BigDecimal money3 = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            money1 += .10;
            money2 += .10;
            money3 = money3.add(new BigDecimal("0.10"));
            System.out.print("Float: " + money1 + " Double: " + money2 + " BigDecimal: " + money3);
            System.out.println();
        }

        money1 = 0;
        money2 = 0;
        money3 = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {
            money1 += 19.99;
            money2 += 19.99;
            money3 = money3.add(new BigDecimal("19.99"));
        }

        System.out.print("Float: " + money1 + " Double: " + money2 + " BigDecimal: " + money3);
    }
}
