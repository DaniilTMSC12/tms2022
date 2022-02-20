package com.tms.clothes;

public class Main {
    public static void main(String[] args) {
        Clothes pants = new Pants(Size.L, 10000, "Чёрный");
        Clothes skirt = new Skirt(Size.M, 5000, "Розовый");
        Clothes tie = new Tie(Size.XS, 2500, "Красный");
        Clothes tShirt = new TShirt(Size.XXS, 3500, "Белый");
        Clothes[] clothes = {pants, skirt, tie, tShirt};
        Atelier atelier = new Atelier();
        atelier.dressMen(clothes);
        System.out.println("-------------------------");
        atelier.dressWomen(clothes);

    }
}
