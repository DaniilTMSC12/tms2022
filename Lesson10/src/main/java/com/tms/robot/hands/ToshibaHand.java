package com.tms.robot.hands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToshibaHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднята рука Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
