package com.tms.person.jackets;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PradaJacket implements IJacket {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел куртку Prada");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Prada");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
