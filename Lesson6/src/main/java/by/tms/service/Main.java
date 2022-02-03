package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i9-9337k", "32 ГБ", "1 ТБ", 1);
        System.out.println(computer);
        computer.info();
        computer.on();
        computer.off();
    }
}
