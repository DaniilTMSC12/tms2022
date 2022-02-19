package com.tms.robot.legs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToshibaLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Сделал шаг ногой Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
