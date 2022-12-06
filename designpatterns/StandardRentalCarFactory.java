package com.example.designpatterns;


public class StandardRentalCarFactory implements RentalCarFactory {

    public RentalCar createRentalCar(int passengerCount) {
        RentalCar rentalCar = null;
        if(passengerCount > 0 && passengerCount <= 2 ) {
            rentalCar = new Sports();
        } else if(passengerCount > 2 && passengerCount <= 4 ){
            rentalCar = new Compact();
        } else if(passengerCount > 4 && passengerCount <= 8) {
            rentalCar = new SUV();
        } else if (passengerCount > 8 && passengerCount <= 12) {
            rentalCar = new Van();
        }
        return rentalCar;
    }
}
