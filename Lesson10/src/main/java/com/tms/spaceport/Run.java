package com.tms.spaceport;

public class Run {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
        IStart spacex = new SpaceX();
        Spaceport spaceport = new Spaceport();
        spaceport.start(shuttle);
        System.out.println("------------------------------");
        System.out.println("Ну что, полетели на Марс?");
        spaceport.start(spacex);
    }
}
