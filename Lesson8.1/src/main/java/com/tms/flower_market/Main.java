package com.tms.flower_market;

public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
//        System.out.println(flowerMarket.getBouquet(com.tms.flower_market.Constants.ROSE, com.tms.flower_market.Constants.GERBERA));
        Bouquet bouquet = flowerMarket.getBouquet(Constants.ROSE, Constants.GERBERA);
        Bouquet bouquet2 = flowerMarket.getBouquet(Constants.ASTER, Constants.LILY);
        bouquet.print();
        System.out.println(bouquet.priceOfBouquet());
        flowerMarket.printSoldBouquets();

    }
}
