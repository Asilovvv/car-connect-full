package com.example.car_connect.patterns.builder;

public class RentalCar {
    private String make;
    private String model;
    private int year;
    private double pricePerDay;

    public RentalCar(String make, String model, int year, double pricePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}