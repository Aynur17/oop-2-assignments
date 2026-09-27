package com.nhlstenden.flightbooking;

public class AirportDistance
{
    private static final int JFK_AMS_DISTANCE = 5848;
    private static final int JFK_MEX_DISTANCE = 3366;
    private static final int JFK_LAX_DISTANCE = 3975;
    private static final int AMS_MEX_DISTANCE = 9206;
    private static final int AMS_LAX_DISTANCE = 8956;
    private static final int MEX_LAX_DISTANCE = 2500;


    public AirportDistance()
    {
    }

    public int getDistance(AirportCode departureAirport, AirportCode arrivalAirport)
    {
        if ((departureAirport == AirportCode.JFK && arrivalAirport == AirportCode.AMS)
        || (departureAirport == AirportCode.AMS && arrivalAirport == AirportCode.JFK))
        {
            return JFK_AMS_DISTANCE;
        }

        if ((departureAirport == AirportCode.JFK && arrivalAirport == AirportCode.MEX)
            || (departureAirport == AirportCode.MEX && arrivalAirport == AirportCode.JFK))
        {
            return JFK_MEX_DISTANCE;
        }

        if ((departureAirport == AirportCode.JFK && arrivalAirport == AirportCode.LAX)
            || (departureAirport == AirportCode.LAX && arrivalAirport == AirportCode.JFK))
        {
            return JFK_LAX_DISTANCE;
        }

        if ((departureAirport == AirportCode.AMS && arrivalAirport == AirportCode.MEX)
        || (departureAirport == AirportCode.MEX && arrivalAirport == AirportCode.AMS))
        {
            return AMS_MEX_DISTANCE;
        }

        if ((departureAirport == AirportCode.AMS && arrivalAirport == AirportCode.LAX)
        || (departureAirport == AirportCode.LAX && arrivalAirport == AirportCode.AMS))

        {
            return AMS_LAX_DISTANCE;
        }

        if ((departureAirport == AirportCode.MEX && arrivalAirport == AirportCode.LAX)
            || (departureAirport == AirportCode.LAX && arrivalAirport == AirportCode.MEX))
        {
            return MEX_LAX_DISTANCE;
        }

        else
        {
            throw new IllegalArgumentException("invalid route");
        }
    }
}
