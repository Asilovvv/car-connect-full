package com.example.car_connect.patterns.strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    public String pay(double amount) {
        return "Paid $" + amount + " by card";
    }
}