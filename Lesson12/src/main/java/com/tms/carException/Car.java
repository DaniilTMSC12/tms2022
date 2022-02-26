package com.tms.carException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class Car {
    private String model;
    private int speed;
    private int cost;
    private Random random = new Random();

    public Car(String model, int speed, int cost) {
        this.model = model;
        this.speed = speed;
        this.cost = cost;
    }

    public void startCar() throws CarStartException {
        int number = random.nextInt(21);
        System.out.println("Число равно " + number);
        if (number % 2 == 0) {
            throw new CarStartException("Автомобиль " + getModel() + " не завёлся.");
        } else {
            System.out.println("Автомобиль " + getModel() + " успешно завёлся!");
        }
    }
}
