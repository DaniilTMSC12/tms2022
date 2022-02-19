package com.tms.person.shoes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ZaraShoes implements IShoes {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел обувь Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Zara");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
