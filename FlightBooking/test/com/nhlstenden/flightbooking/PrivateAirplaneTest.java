package com.nhlstenden.flightbooking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrivateAirplaneTest
{

    @Test
    void reserveSeat_availableSeat_increasesSeatsTaken()
    {
        PrivateAirplane airplane =
                new PrivateAirplane("Flight123", 10000, 3);

        airplane.reserveSeat();

        assertEquals(1, airplane.getSeatsTaken());
    }

    @Test
    void reserveSeat_allSeatsAvailable_reservesAllSeats()
    {
        PrivateAirplane airplane =
                new PrivateAirplane("Flight123", 10000, 2);

        airplane.reserveSeat();
        airplane.reserveSeat();

        assertEquals(2, airplane.getSeatsTaken());
        assertFalse(airplane.hasAvailableSeat());
    }

    @Test
    void reserveSeat_noSeatsAvailable_throwsException()
    {
        PrivateAirplane airplane =
                new PrivateAirplane("Flight123", 10000, 1);

        airplane.reserveSeat();

        assertThrows(IllegalArgumentException.class, () ->
                airplane.reserveSeat());
    }
}