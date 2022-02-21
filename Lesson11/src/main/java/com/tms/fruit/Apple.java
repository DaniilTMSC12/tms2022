package com.tms.fruit;

public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    @Override
    double getCost() {
        return super.getWeight() * 2;
    }
}
