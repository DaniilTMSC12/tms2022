package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PassengerGroundTransport extends GroundTransport {
    private String bodyType;
    private int passengerSeat;

    public String getInfo() {
        return super.getInfo() + " Тип кузова - " + bodyType + " Количество мест - "
                + passengerSeat + " Мощность в киловаттах - " + powerInKW();
    }

    public void tripOnCar(double hoursOfRide) {
        double distance = getMaxSpeed() * hoursOfRide;
        System.out.println("За время " + hoursOfRide + " ч, автомобиль " + getName() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет " +
                distance + " км и израсходует " + getAmountOfFuel(distance) + " литров топлива.");
    }

    private double getAmountOfFuel(double distance) {
        return (distance / 100) * getFuelConsumption();
    }
}
