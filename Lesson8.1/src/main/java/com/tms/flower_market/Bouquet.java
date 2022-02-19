package com.tms.flower_market;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int priceOfBouquet() {
        int result = 0;
        for (Flower flower : flowers) {
            result += flower.getCost();
        }
        return result;
    }

    public void print() {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
