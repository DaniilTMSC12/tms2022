package com.tms.person.shoes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PradaShoes implements IShoes {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел обувь Prada");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Prada");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
