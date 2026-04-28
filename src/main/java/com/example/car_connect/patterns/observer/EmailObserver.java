package com.example.car_connect.patterns.observer;

public class EmailObserver implements NotificationObserver {
    public String update(String message) {
        return "Email notification: " + message;
    }
}