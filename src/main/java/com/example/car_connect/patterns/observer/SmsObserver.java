package com.example.car_connect.patterns.observer;

public class SmsObserver implements NotificationObserver {
    public String update(String message) {
        return "SMS notification: " + message;
    }
}