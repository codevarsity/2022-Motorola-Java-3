package com.example.designpatterns;

import com.example.designpatterns.RentalCar;

class ElectricSUV implements RentalCar {

    @Override
    public String getName() {
        return "Hyundai IONIQ 5";
    }

    @Override
    public int getNumberOfPassenger() {
        return 7;
    }

    @Override
    public float getPricePerDay() {
        return 80;
    }
}

class ElectricCompact implements RentalCar {
    @Override
    public String getName() {
        return "Tesla T";
    }

    @Override
    public int getNumberOfPassenger() {
        return 4;
    }

    @Override
    public float getPricePerDay() {
        return 50;
    }
}

class ElectricSports implements RentalCar {

    @Override
    public String getName() {
        return "Tesla S";
    }

    @Override
    public int getNumberOfPassenger() {
        return 2;
    }

    @Override
    public float getPricePerDay() {
        return 110;
    }
}

public class ElectricRentalCarFactory implements RentalCarFactory{
    @Override
    public RentalCar createRentalCar(int passengerCount) {
        RentalCar rentalCar = null;
        if(passengerCount > 0 && passengerCount <= 2 ) {
            rentalCar = new ElectricSports();
        } else if(passengerCount > 2 && passengerCount <= 4 ){
            rentalCar = new ElectricCompact();
        } else if(passengerCount > 4 && passengerCount <= 8) {
            rentalCar = new ElectricSUV();
        } else if (passengerCount > 8 && passengerCount <= 12) {

        }
        return rentalCar;
    }
}
