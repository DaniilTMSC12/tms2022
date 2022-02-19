package com.tms.robot.legs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SamsungLeg implements ILeg {
    private int price;


    @Override
    public void step() {
        System.out.println("Сделал шаг ногой Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
