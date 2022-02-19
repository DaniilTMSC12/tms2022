package com.tms.spaceport;

public class Spaceport {


    public void start(IStart iStart) {
        if (iStart.check()) {
            iStart.engineStart();
            System.out.println("10...9...8...7...6...5...4...3...2...1");
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена!");
        }
    }

}

