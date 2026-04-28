package com.example.car_connect.patterns.decorator;

import com.example.car_connect.patterns.builder.RentalCar;

public class InsuranceDecorator implements RentalService {
    private RentalService rentalService;

    public InsuranceDecorator(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    public String rent(RentalCar car) {
        return rentalService.rent(car) + " with insurance";
    }
}