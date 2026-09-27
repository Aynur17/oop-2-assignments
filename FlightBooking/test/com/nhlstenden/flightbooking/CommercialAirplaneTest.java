package com.nhlstenden.flightbooking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommercialAirplaneTest
{
    @Test
    void reserveSeat_economyAvailable_reservesEconomySeat()
    {
        CommercialAirplane airplane =
                new CommercialAirplane("C123", 10000, 2, 2);

        airplane.reserveSeat();

        assertEquals(1, airplane.getSeatsTakenEconomy());
        assertEquals(0, airplane.getSeatsTakenBusiness());
    }

    @Test
    void reserveSeat_economyFull_reservesBusinessSeat()
    {
        CommercialAirplane airplane =
                new CommercialAirplane("C123", 10000, 1, 2);

        airplane.reserveSeat();
        airplane.reserveSeat();

        assertEquals(1, airplane.getSeatsTakenEconomy());
        assertEquals(1, airplane.getSeatsTakenBusiness());
    }

    @Test
    void reserveSeat_allSeatsFull_throwsException()
    {
        CommercialAirplane airplane =
                new CommercialAirplane("C123", 10000, 1, 1);

        airplane.reserveSeat();
        airplane.reserveSeat();

        assertFalse(airplane.hasAvailableSeat());

        assertThrows(IllegalArgumentException.class, () ->
                airplane.reserveSeat());
    }
}