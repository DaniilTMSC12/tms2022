package com.tms.fruit;

public class Main {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(768.9);
        Fruit apple2 = new Apple(300.2);
        Fruit apricot1 = new Apricot(100.5);
        Fruit apricot2 = new Apricot(200.1);
        Fruit pear1 = new Pear(900.65);
        Fruit pear2 = new Pear(1000);
        Fruit[] fruits = {apple1, apple2, apricot1, apricot2, pear1, pear2};

        double result = 0;
        for (Fruit fruit : fruits) {
            result += fruit.getCost();
        }
        System.out.println("Стоимость всех проданных фруктов: " + result + " долларов");


        double resultOfApple = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple)
                resultOfApple += fruit.getCost();
        }
        System.out.println("Стоимость всех проданных яблок: " + resultOfApple + " долларов");

    }
}
