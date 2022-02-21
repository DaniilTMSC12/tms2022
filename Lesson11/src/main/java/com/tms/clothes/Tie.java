package com.tms.clothes;

public class Tie extends Clothes implements MenClothes {

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Галстук, " + super.getColor() + " цвет стоимостью: "
                + super.getPrice() + " долларов. Размер: " + super.getSize().getDescription());
    }
}
