package com.tms.fruit;

public class Pear extends Fruit {

    public Pear(double weight) {
        super(weight);
    }

    @Override
    double getCost() {
        return super.getWeight() * 10;
    }
}
