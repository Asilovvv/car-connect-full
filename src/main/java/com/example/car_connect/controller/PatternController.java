package com.example.car_connect.controller;

import com.example.car_connect.patterns.adapter.ExternalPaymentApi;
import com.example.car_connect.patterns.adapter.PaymentAdapter;
import com.example.car_connect.patterns.builder.RentalCar;
import com.example.car_connect.patterns.builder.RentalCarBuilder;
import com.example.car_connect.patterns.decorator.BasicRentalService;
import com.example.car_connect.patterns.decorator.InsuranceDecorator;
import com.example.car_connect.patterns.decorator.RentalService;
import com.example.car_connect.patterns.facade.RentalFacade;
import com.example.car_connect.patterns.factory.CarFactory;
import com.example.car_connect.patterns.factory.CarType;
import com.example.car_connect.patterns.observer.EmailObserver;
import com.example.car_connect.patterns.observer.NotificationPublisher;
import com.example.car_connect.patterns.observer.SmsObserver;
import com.example.car_connect.patterns.strategy.CardPaymentStrategy;
import com.example.car_connect.patterns.strategy.PaymentStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatternController {

    @GetMapping("/patterns/demo")
    public String demoPatterns() {
        RentalCar car = new RentalCarBuilder()
                .make("Kia")
                .model("K5")
                .year(2020)
                .pricePerDay(50)
                .build();

        CarType carType = CarFactory.createCar("suv");

        PaymentStrategy paymentStrategy = new CardPaymentStrategy();

        ExternalPaymentApi externalPaymentApi = new ExternalPaymentApi();
        PaymentAdapter paymentAdapter = new PaymentAdapter(externalPaymentApi);

        RentalService rentalService = new BasicRentalService();
        rentalService = new InsuranceDecorator(rentalService);

        NotificationPublisher publisher = new NotificationPublisher();
        publisher.addObserver(new EmailObserver());
        publisher.addObserver(new SmsObserver());

        RentalFacade rentalFacade = new RentalFacade(
                paymentStrategy,
                paymentAdapter,
                rentalService,
                publisher
        );

        return rentalFacade.rentCar(car, carType);
    }
}