package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MillitaryAirTransport extends AirTransport {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public String getInfo() {
        return super.getInfo() + " Наличие системы катапультирования - " + ejectionSystem
                + " Количество ракет " + numberOfMissiles + " Мощность в киловаттах - " + powerInKW();
    }

    public void missilesShot() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла!!!");
            numberOfMissiles--;
        } else {
            System.out.println("Недостаточно ракет.");
        }
    }

    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }
}
