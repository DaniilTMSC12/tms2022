package com.tms.clothes;

public class Pants extends Clothes implements MenClothes, WomenClothes {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Штаны, " + super.getColor() + " цвет стоимостью: "
                + super.getPrice() + " долларов. Размер: " + super.getSize().getDescription());
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны, " + super.getColor() + " цвет стоимостью: "
                + super.getPrice() + " долларов. Размер: " + super.getSize().getDescription());
    }
}
