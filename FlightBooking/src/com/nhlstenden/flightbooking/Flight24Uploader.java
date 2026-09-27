package com.nhlstenden.flightbooking;

import java.util.ArrayList;
import java.util.List;

public class Flight24Uploader
{
    private List<String> flightData;
    private List<String> airplaneData;

    public Flight24Uploader()
    {
        this.flightData = new ArrayList<>();
        this.airplaneData = new ArrayList<>();
    }

    public void uploadFlight(Flight flight)
    {
        String data = "F: "
                + flight.getDepartureAirport()
                + " -> "
                + flight.getArrivalAirport()
                + ". Departure "
                + flight.getDepartureTime()
                + ".";

        this.flightData.add(data);
    }

    public void uploadAirplane(Airplane airplane)
    {
        int emptySeats = airplane.getTotalSeats() - airplane.getSeatsTaken();

        String data = "P: "
                + airplane.getCode()
                + ". "
                + airplane.getFuelLevel()
                + " liter fuel. "
                + emptySeats
                + " empty seats.";

        this.airplaneData.add(data);
    }
}