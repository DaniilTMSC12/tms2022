package com.tms.instruments;

public interface Instrument {
    enum Type {
        GUITAR, DRUM, TRUMPET
    }

    void play();

    String key = "До мажор";
}
