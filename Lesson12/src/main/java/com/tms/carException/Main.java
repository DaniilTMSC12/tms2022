package com.tms.carException;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 200, 20000);
        Car mers = new Car("Mercedes", 250, 25000);
        Car audi = new Car("Audi", 180, 18000);

        try {
            mers.startCar();
            bmw.startCar();
            audi.startCar();
        } catch (CarStartException e) {
            e.printStackTrace();
        }

    }
}
