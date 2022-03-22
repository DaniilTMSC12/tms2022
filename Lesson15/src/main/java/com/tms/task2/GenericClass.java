package com.tms.task2;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class GenericClass<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void getClassName() {
        System.out.println("Имя класса для T - " + t.getClass().getName());
        System.out.println("Имя класса для V - " + v.getClass().getName());
        System.out.println("Имя класса для K - " + k.getClass().getName());
    }
}
