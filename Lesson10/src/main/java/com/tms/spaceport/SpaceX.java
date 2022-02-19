package com.tms.spaceport;

import java.util.Scanner;

public class SpaceX implements IStart {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean check() {
        System.out.println("Здравсвуйте, Павел! Для полета на Марс введите ответ на следующий пример: 2+2*2 = ?");
        if (scanner.nextInt() == 6) {
            return true;
        }
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Все системы в норме. Запускаю двигатели.");
    }

    @Override
    public void start() {
        System.out.println("Вы удачно взлетели и приземлились на Марсе. Пришельцы встречают вас с хлебом и солью!");
    }
}
