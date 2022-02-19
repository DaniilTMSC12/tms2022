package com.tms.person.jackets;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BershkaJacket implements IJacket {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел куртку Bershka");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Bershka");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
