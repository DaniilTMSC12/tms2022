package com.tms.person.pants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BershkaPants implements IPants {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел штаны Bershka");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Bershka");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

