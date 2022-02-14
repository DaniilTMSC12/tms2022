package com.tms.transport;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport(500, 238, 1500, "BMW");
        GroundTransport groundTransport = new GroundTransport(4, 13.7);
        PassengerGroundTransport passGroundTransport = new PassengerGroundTransport("Седан", 4);
        FreightGroundTransport freiGroundTransport = new FreightGroundTransport(15000);
        AirTransport airTransport = new AirTransport(15, 5000);
        MillitaryAirTransport millAirTransport = new MillitaryAirTransport(true, 1);
        CivilAirTransport civilAirTransport = new CivilAirTransport(15, true);

    }
}
