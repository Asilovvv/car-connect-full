package com.example.car_connect.patterns.factory;

public class CarFactory {
    public static CarType createCar(String type) {
        if ("suv".equalsIgnoreCase(type)) {
            return new SuvCar();
        }
        return new EconomyCar();
    }
}