package com.tms.clothes;

public class TShirt extends Clothes implements MenClothes, WomenClothes {

    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Футболка, " + super.getColor() + " цвет стоимостью: "
                + super.getPrice() + " долларов. Размер: " + super.getSize().getDescription());

    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка, " + super.getColor() + " цвет стоимостью: "
                + super.getPrice() + " долларов. Размер: " + super.getSize().getDescription());

    }
}
