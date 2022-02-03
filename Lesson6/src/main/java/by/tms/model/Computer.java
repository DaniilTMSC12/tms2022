package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String proccesor;
    private String opMemory;
    private String hdd;
    private int cycle;
    private boolean fault;
    private boolean burnt;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    public Computer(String proccesor, String opMemory, String hdd, int cycle) {
        this.proccesor = proccesor;
        this.opMemory = opMemory;
        this.hdd = hdd;
        this.cycle = cycle;
    }

    public void info() {
        System.out.println("Процессор: " + proccesor + " Оперативная память: " + opMemory + " Жёсткий диск: " + hdd + " Кол-во циклов: " + cycle);
    }

    public void on() {
        // Проверка на циклы
        if (this.cycle <= 0) {
            System.out.println("В вашем компьютере закончились циклы работы и он сгорел :(");
            this.burnt = true;
        } else {
            // Проверка на возгорание
            if (this.burnt) {
                System.out.println("Совсем недавно вы испортили свой компьютер...(он сгорел :( )");
            }
            System.out.println("Запускаю компьютер...");
            this.fault = random.nextBoolean();
            if (fault) {
                int problem = random.nextInt(2);
                System.out.println("Сбой! Введите число (0 или 1):");
                if (scanner.hasNextInt()) {
                    int solution = scanner.nextInt();
                    if (problem == solution) {
                        System.out.println("Проблема решена! Выключаю компьютер...");
                        off();
                    } else {
                        System.out.println("Ну ты молодец! Компьютер сгорел!!!");
                        this.burnt = true;
                        on();
                    }

                } else {
                    System.out.println("Ты ввёл неправильный формат числа! Компьютер сгорел!!!");
                    this.burnt = true;
                    on();
                }
            } else {
                System.out.println("Компьютер включился!");
                off();
            }
        }


    }

    public void off() {
        System.out.println("Компьютер выключается...");
        --this.cycle;
    }


}
