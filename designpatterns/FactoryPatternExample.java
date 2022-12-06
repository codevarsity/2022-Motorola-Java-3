package com.example.designpatterns;


class Compact implements RentalCar {

    @Override
    public String getName() {
        return "VW Golf";
    }

    @Override
    public int getNumberOfPassenger() {
        return 3;
    }

    @Override
    public float getPricePerDay() {
        return 20;
    }
}

class Sports implements RentalCar {

    @Override
    public String getName() {
        return "Porche Boxter";
    }

    @Override
    public int getNumberOfPassenger() {
        return 2;
    }

    @Override
    public float getPricePerDay() {
        return 100;
    }
}

class SUV implements RentalCar {

    @Override
    public String getName() {
        return "Cadillac Escalade";
    }

    @Override
    public int getNumberOfPassenger() {
        return 7;
    }

    @Override
    public float getPricePerDay() {
        return 75;
    }
}




public class FactoryPatternExample {

    static RentalCarFactory factory = new StandardRentalCarFactory();
    private static void printRecommendation(int[] passengerCount) {

        RentalCarFactory factory = RentalCarFactoryCreator.createFactory("Electric");
        for(int count : passengerCount) {
            RentalCar rentalCar = factory.createRentalCar(count);
            if(rentalCar != null) {
                System.out.println("For " + count + " number of passengers we recommend " + rentalCar.getName());
            } else {
                System.out.println("For " + count + " number of passengers we donot have a recommended car");
            }
        }
    }
    public static void main(String[] args) {
        int[] passengerCount = new int[] {2, 5, 1, 6, 9, 4};
        printRecommendation(passengerCount);
    }
}
