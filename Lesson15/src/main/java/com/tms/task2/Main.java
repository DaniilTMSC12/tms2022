package com.tms.task2;

public class Main {
    public static void main(String[] args) {
        GenericClass<String, Animal, Integer> genericClass = new GenericClass<>("Hello", new Animal(), 1);
        genericClass.getClassName();
    }
}
