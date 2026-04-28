package com.example.car_connect.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {
    private List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public String notifyObservers(String message) {
        StringBuilder result = new StringBuilder();

        for (NotificationObserver observer : observers) {
            result.append(observer.update(message)).append("\n");
        }

        return result.toString();
    }
}