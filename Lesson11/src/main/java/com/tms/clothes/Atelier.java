package com.tms.clothes;

public class Atelier {

    public void dressMen(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof MenClothes) {
                ((MenClothes) clothes[i]).dressMen();
            }
        }
    }


    public void dressWomen(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomenClothes) {
                ((WomenClothes) clothes[i]).dressWomen();
            }
        }
    }
}
