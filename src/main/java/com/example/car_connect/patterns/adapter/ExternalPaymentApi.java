package com.example.car_connect.patterns.adapter;

public class ExternalPaymentApi {
    public String makePayment(double amount) {
        return "External payment API processed $" + amount;
    }
}