package com.tms.person.pants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ZaraPants implements IPants {
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел штаны Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Zara");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
