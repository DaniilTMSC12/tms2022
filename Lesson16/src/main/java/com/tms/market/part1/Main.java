package com.tms.market.part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Market market = new Market(new ArrayList<>());
        Product tomato = new Product(1, "Помидор", 133);
        Product cucumber = new Product(2, "Огурец", 100);
        Product milk = new Product(3, "Молоко", 150);
        Product pepsi = new Product(3, "Газировка", 200);
        market.addProduct(tomato);
        market.addProduct(cucumber);
        market.addProduct(milk);
        System.out.println(market.getListOfProducts());
        System.out.println(market.sortByIncreasePrice());
        System.out.println("------------------------------------------");
        market.removeProduct(2);
        System.out.println(market.getListOfProducts());
        System.out.println(market.sortByReverse());
        System.out.println("------------------------------------------");
        market.editProduct(pepsi);
        System.out.println(market.getListOfProducts());


    }
}
