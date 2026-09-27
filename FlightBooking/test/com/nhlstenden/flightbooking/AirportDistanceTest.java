package com.nhlstenden.flightbooking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportDistanceTest
{

    @Test
    void getDistance_jfkToAms_returns5848()
    {
        AirportDistance airportDistance = new AirportDistance();

        assertEquals(5848, airportDistance.getDistance(AirportCode.JFK, AirportCode.AMS));
    }

    @Test
    void getDistance_amsToJfk_returns5848() // reverse
    {
        AirportDistance airportDistance = new AirportDistance();

        assertEquals(5848, airportDistance.getDistance(AirportCode.AMS, AirportCode.JFK));
    }

    @Test
    void getDistance_sameRoute_throwsException()
    {
        AirportDistance airportDistance = new AirportDistance();

        assertThrows(IllegalArgumentException.class, () ->
                airportDistance.getDistance(AirportCode.JFK, AirportCode.JFK));
    }

}