package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GroundTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public String getInfo() {
        return super.getInfo() + " Количестов колёс - " + numberOfWheels
                + " Расход топлива -" + fuelConsumption;
    }
}
