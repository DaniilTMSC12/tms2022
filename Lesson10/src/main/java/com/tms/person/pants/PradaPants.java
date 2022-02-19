package com.tms.person.pants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PradaPants implements IPants {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел штаны Prada");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Prada");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
