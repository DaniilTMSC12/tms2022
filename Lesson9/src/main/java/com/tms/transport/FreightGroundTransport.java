package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FreightGroundTransport extends GroundTransport {
    private int loadCapacity;

    public String getInfo() {
        return super.getInfo() + " Грузоподъемность - " + loadCapacity
                + " Мощность в киловаттах - " + powerInKW();
    }


    public void isLoadCapacityEnough(int cargoWeight) {
        if (loadCapacity >= cargoWeight) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }


}
