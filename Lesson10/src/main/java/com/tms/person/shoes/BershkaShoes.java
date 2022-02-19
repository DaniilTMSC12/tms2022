package com.tms.person.shoes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BershkaShoes implements IShoes {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел обувь Bershka");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Bershka");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
