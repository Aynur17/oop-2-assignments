package com.nhlstenden.flightbooking;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest
{

    @Test
    void constructor_newFlight_statusIsAwaitingDeparture()
    {
        PrivateAirplane airplane =
                new PrivateAirplane("P123", 10000, 2);

        Flight flight = new Flight(
                AirportCode.AMS,
                AirportCode.LAX,
                LocalDateTime.of(2026, 9, 27, 12, 54),
                airplane
        );

        assertEquals(FlightStatus.AWAITING_DEPARTURE, flight.getStatus());
    }

    @Test
    void depart_enoughFuel_changesStatusToDeparted()
    {
        PrivateAirplane airplane =
                new PrivateAirplane("P123", 100000, 2);

        Flight flight = new Flight(
                AirportCode.AMS,
                AirportCode.LAX,
                LocalDateTime.of(2026, 9, 27, 12, 54),
                airplane
        );

        flight.depart();

        assertEquals(FlightStatus.DEPARTED, flight.getStatus());
    }
}