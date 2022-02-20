package com.tms.clothes;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return name() + " Детский размер.";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;


    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return name() + " Взрослый размер";
    }
}

