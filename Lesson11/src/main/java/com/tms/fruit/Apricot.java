package com.tms.fruit;

public class Apricot extends Fruit {

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    double getCost() {
        return super.getWeight() * 3.5;
    }
}
