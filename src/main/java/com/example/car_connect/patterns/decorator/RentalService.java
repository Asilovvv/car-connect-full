package com.example.car_connect.patterns.decorator;

import com.example.car_connect.patterns.builder.RentalCar;

public interface RentalService {
    String rent(RentalCar car);
}