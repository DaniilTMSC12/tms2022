package com.tms.flower_market;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FlowerMarket {
    private int countOfSoldBouquets;

    public Bouquet getBouquet(String... flowersName) {
        Flower[] flowers = new Flower[flowersName.length];
        for (int i = 0; i < flowersName.length; i++) {
            String flower = flowersName[i];
            for (int j = 0; j < Constants.flowerNameCostArray.length; j++) {
                if (flower.equalsIgnoreCase(Constants.flowerNameCostArray[j][0])) {
                    String stringCost = Constants.flowerNameCostArray[j][1];
                    int cost = Integer.parseInt(stringCost);
                    Flower flowerCostName = new Flower(flower, cost);
                    flowers[i] = flowerCostName;
                    break;
                }
            }
        }
        countOfSoldBouquets++;
        return new Bouquet(flowers);

    }

    public void printSoldBouquets() {
        System.out.println("Кол-во проданных букетов = " + countOfSoldBouquets);
    }

}
