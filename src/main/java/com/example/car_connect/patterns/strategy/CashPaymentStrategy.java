package com.example.car_connect.patterns.strategy;

public class CashPaymentStrategy implements PaymentStrategy {
    public String pay(double amount) {
        return "Paid $" + amount + " by cash";
    }
}