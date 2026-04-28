package com.example.car_connect.patterns.decorator;

import com.example.car_connect.patterns.builder.RentalCar;

public class BasicRentalService implements RentalService {
    public String rent(RentalCar car) {
        return car.getMake() + " " + car.getModel() + " rented";
    }
}