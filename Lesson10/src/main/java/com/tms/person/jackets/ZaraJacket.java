package com.tms.person.jackets;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ZaraJacket implements IJacket {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел куртку Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Zara");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
