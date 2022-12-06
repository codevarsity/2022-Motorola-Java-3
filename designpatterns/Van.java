package com.example.designpatterns;

public class Van implements RentalCar{

    @Override
    public String getName() {
        return "Mercedez Mini Van";
    }

    @Override
    public int getNumberOfPassenger() {
        return 10;
    }

    @Override
    public float getPricePerDay() {
        return 120;
    }
}
