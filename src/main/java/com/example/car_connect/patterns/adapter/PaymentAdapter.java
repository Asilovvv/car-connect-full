package com.example.car_connect.patterns.adapter;

public class PaymentAdapter {
    private ExternalPaymentApi externalPaymentApi;

    public PaymentAdapter(ExternalPaymentApi externalPaymentApi) {
        this.externalPaymentApi = externalPaymentApi;
    }

    public String pay(double amount) {
        return externalPaymentApi.makePayment(amount);
    }
}