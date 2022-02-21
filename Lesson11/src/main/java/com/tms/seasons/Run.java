package com.tms.seasons;

import static com.tms.seasons.Season.*;

public class Run {
    public static void main(String[] args) {
        Season winter = WINTER;
        Season favoriteSeason = SUMMER;
        System.out.println(favoriteSeason);
        iLoveSummer(favoriteSeason);
        winter.getDescription();
        favoriteSeason.getDescription();

        Season[] seasons = {WINTER, SPRING, SUMMER, AUTUMN};
        for (Season season : seasons) {
            System.out.println("Сезон " + season
                    + ". Средняя температура " + season.getAverageTemp() +
                    ". " + season.getDescription());
        }


    }

    public static void iLoveSummer(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
        }
    }
}
