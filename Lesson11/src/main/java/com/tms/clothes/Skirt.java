package com.tms.clothes;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка, " + super.getColor() + " цвет стоимостью: "
                + super.getPrice() + " долларов. Размер: " + super.getSize().getDescription());
    }
}

