package com.example.car_connect.patterns.builder;

public class RentalCarBuilder {
    private String make;
    private String model;
    private int year;
    private double pricePerDay;

    public RentalCarBuilder make(String make) {
        this.make = make;
        return this;
    }

    public RentalCarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public RentalCarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public RentalCarBuilder pricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public RentalCar build() {
        return new RentalCar(make, model, year, pricePerDay);
    }
}