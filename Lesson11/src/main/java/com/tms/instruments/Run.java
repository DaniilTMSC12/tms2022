package com.tms.instruments;

import static com.tms.instruments.Instrument.Type.*;

public class Run {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = createInstrument(GUITAR);
        instruments[1] = createInstrument(DRUM);
        instruments[2] = createInstrument(TRUMPET);

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();

        }
    }

    public static Instrument createInstrument(Instrument.Type type) {
        switch (type) {
            case GUITAR:
                return new Guitar(7);
            case DRUM:
                return new Drum("Big");
            case TRUMPET:
                return new Trumpet(250);
        }
        return null;
    }
}
