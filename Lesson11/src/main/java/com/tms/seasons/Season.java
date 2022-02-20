package com.tms.seasons;

public enum Season {
    WINTER("-25"),
    SPRING("+15"),
    AUTUMN("+5"),
    SUMMER("+25") {
        @Override
        public String getDescription() {
            return "Теплое время года.";
        }
    };

    private String averageTemp;

    Season(String averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getDescription() {
        return "Холодное время года.";
    }

    public String getAverageTemp() {
        return averageTemp;
    }
}

