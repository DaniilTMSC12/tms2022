package com.tms.instruments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Trumpet implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба диаметром: " + diameter);
    }
}
