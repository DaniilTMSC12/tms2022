package com.tms.instruments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drum implements Instrument {
    private String size;

    @Override
    public void play() {
        System.out.println("Играем барабан размером " + size);
    }
}
