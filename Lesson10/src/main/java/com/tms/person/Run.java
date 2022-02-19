package com.tms.person;

import com.tms.person.jackets.BershkaJacket;
import com.tms.person.jackets.IJacket;
import com.tms.person.jackets.PradaJacket;
import com.tms.person.jackets.ZaraJacket;
import com.tms.person.pants.BershkaPants;
import com.tms.person.pants.IPants;
import com.tms.person.pants.PradaPants;
import com.tms.person.pants.ZaraPants;
import com.tms.person.shoes.BershkaShoes;
import com.tms.person.shoes.IShoes;
import com.tms.person.shoes.PradaShoes;
import com.tms.person.shoes.ZaraShoes;

public class Run {
    public static void main(String[] args) {
        System.out.println("Создание и презентация Алексея");
        IJacket pradaJacket = new PradaJacket(250);
        IPants bershkaPants = new BershkaPants(400);
        IShoes zaraShoes = new ZaraShoes(100);
        IPerson alexey = new Person("Алексей", pradaJacket, bershkaPants, zaraShoes);
        System.out.println("Одеваемся...");
        alexey.getDressed();
        System.out.println("Раздеваемся...");
        alexey.getUndressed();
        System.out.println("------------------------------");

        System.out.println("Создание и презентация Даниила");
        IJacket bershkaJacket = new BershkaJacket(336);
        IPants pradaPants = new PradaPants(561);
        IShoes pradaShoes = new PradaShoes(1234);
        IPerson daniil = new Person("Даниил", bershkaJacket, pradaPants, pradaShoes);
        System.out.println("Одеваемся...");
        daniil.getDressed();
        System.out.println("Раздеваемся...");
        daniil.getUndressed();
        System.out.println("------------------------------");

        System.out.println("Создание и презентация Павла");
        IJacket zaraJacket = new ZaraJacket(15000);
        IPants zaraPants = new ZaraPants(234);
        IShoes bershkaShoes = new BershkaShoes(15000);
        IPerson pavel = new Person("Павел", zaraJacket, zaraPants, bershkaShoes);
        System.out.println("Одеваемся...");
        pavel.getDressed();
        System.out.println("Раздеваемся...");
        pavel.getUndressed();
        System.out.println("------------------------------");

        System.out.println("Расчёт человека с наиболее дорогими вещами...");
        if (alexey.getPrice() > daniil.getPrice() && alexey.getPrice() > pavel.getPrice()) {
            System.out.println("Алексей, цена его вещей составляет " + alexey.getPrice() + " долларов.");
        } else if (daniil.getPrice() > alexey.getPrice() && daniil.getPrice() > pavel.getPrice()) {
            System.out.println("Даниил, цена его вещей составляет " + daniil.getPrice() + " долларов.");
        } else {
            System.out.println("Павел, цена его вещей составляет " + pavel.getPrice() + " долларов.");
        }

    }
}
