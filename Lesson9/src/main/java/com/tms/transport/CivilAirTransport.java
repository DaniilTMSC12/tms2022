package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CivilAirTransport extends AirTransport {
    private int passengerSeat;
    private boolean businessClass;


    public String getInfo() {
        return super.getInfo() + " Количество посадочных мест - " + passengerSeat
                + " Наличие мест бизнесс-класса - " + businessClass
                + " Мощность в киловаттах - " + powerInKW();
    }

    public void isPassengerSeatEnough(int passenger) {
        if (passengerSeat >= passenger) {
            System.out.println("Пассажиры укомплектованы в самолёт.");
        } else {
            System.out.println("Вам нужен самолёт побольше.");
        }
    }
}
