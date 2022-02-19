package com.tms.spaceport;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean check() {
        Random random = new Random();
        int a = random.nextInt(11);
        if (a > 3) {
            return true;
        }
        return false;
    }


    @Override
    public void engineStart() {
        System.out.println("Двигатели шатла запущены.");
        System.out.println("Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла!");
    }
}
