package com.tms.robot.legs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Сделал шаг ногой Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
