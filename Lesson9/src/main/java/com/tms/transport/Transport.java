package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transport {
    private int power;
    private int maxSpeed;
    private int mass;
    private String name;


    public double powerInKW() {
        return getPower() * 0.74;
    }


    public String getInfo() {
        return "Марка - " + name + " Мощность - " + power + " Максимальная скорость - " + maxSpeed
                + " Масса транспорта - " + mass;
    }
}
