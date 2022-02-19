package com.tms.robot.hands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SamsungHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднята рука Самсунг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
