package com.example.car_connect.patterns.facade;

import com.example.car_connect.patterns.adapter.PaymentAdapter;
import com.example.car_connect.patterns.builder.RentalCar;
import com.example.car_connect.patterns.decorator.RentalService;
import com.example.car_connect.patterns.factory.CarType;
import com.example.car_connect.patterns.observer.NotificationPublisher;
import com.example.car_connect.patterns.strategy.PaymentStrategy;

public class RentalFacade {
    private PaymentStrategy paymentStrategy;
    private PaymentAdapter paymentAdapter;
    private RentalService rentalService;
    private NotificationPublisher notificationPublisher;

    public RentalFacade(
            PaymentStrategy paymentStrategy,
            PaymentAdapter paymentAdapter,
            RentalService rentalService,
            NotificationPublisher notificationPublisher
    ) {
        this.paymentStrategy = paymentStrategy;
        this.paymentAdapter = paymentAdapter;
        this.rentalService = rentalService;
        this.notificationPublisher = notificationPublisher;
    }

    public String rentCar(RentalCar car, CarType carType) {
        String result = "";

        result += "Car type: " + carType.getType() + "\n";
        result += rentalService.rent(car) + "\n";
        result += paymentStrategy.pay(car.getPricePerDay()) + "\n";
        result += paymentAdapter.pay(car.getPricePerDay()) + "\n";
        result += notificationPublisher.notifyObservers("Car successfully booked");

        return result.replace("\n", "<br>");
    }
}