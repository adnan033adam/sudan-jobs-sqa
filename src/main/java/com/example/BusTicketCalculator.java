
package com.example;

public class BusTicketCalculator {

    public static double calculatePrice(int age, int distance) {
        double basePrice = distance * 0.5;

        if (age < 12) {
            return basePrice * 0.5;
        } else if (age >= 60) {
            return basePrice * 0.7;
        } else {
            return basePrice;
        }
    }
}
