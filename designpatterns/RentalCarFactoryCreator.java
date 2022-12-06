package com.example.designpatterns;

public class RentalCarFactoryCreator {
    public static RentalCarFactory createFactory(String type) {
        RentalCarFactory factory = null;
        if(type.equals("Electric")) {
            //create electric car factor
            factory = new ElectricRentalCarFactory();
        } else if(type.equals("Standard")) {
            //create standard car factory
            factory = new StandardRentalCarFactory();
        } else if(type.equals("Hydrogen")) {
            //create hydrogen based cars
        }
        return factory;

    }
}
