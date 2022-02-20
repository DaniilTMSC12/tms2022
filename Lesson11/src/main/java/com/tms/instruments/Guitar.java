package com.tms.instruments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guitar implements Instrument {
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Играет Гитара с количеством струн: " + numberOfStrings);
    }
}
