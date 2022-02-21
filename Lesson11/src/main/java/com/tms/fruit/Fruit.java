package com.tms.fruit;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
abstract class Fruit {
    private double weight;


    public final void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    abstract double getCost();
}
