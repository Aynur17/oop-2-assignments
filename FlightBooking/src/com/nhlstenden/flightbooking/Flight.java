package com.nhlstenden.flightbooking;

import java.time.LocalDateTime;

public class Flight
{
    private AirportCode departureAirport;
    private AirportCode arrivalAirport;
    private LocalDateTime departureTime;
    private Airplane airplane;
    private FlightStatus status;


    public Flight(AirportCode departureAirport, AirportCode arrivalAirport, LocalDateTime departureTime, Airplane airplane)
    {
        this.setDepartureAirport(departureAirport);
        this.setArrivalAirport(arrivalAirport);
        this.setDepartureTime(departureTime);
        this.setAirplane(airplane);

        this.status = FlightStatus.AWAITING_DEPARTURE; // a new flight automatically starts as awaiting departure
    }

    public AirportCode getDepartureAirport()
    {
        return this.departureAirport;
    }

    public void setDepartureAirport(AirportCode departureAirport)
    {
        if (departureAirport == null)
        {
            throw new IllegalArgumentException("departureAirport cannot be null");
        }

        this.departureAirport = departureAirport;
    }

    public AirportCode getArrivalAirport()
    {
        return this.arrivalAirport;
    }

    public void setArrivalAirport(AirportCode arrivalAirport)
    {
        if (arrivalAirport == null)
        {
            throw new IllegalArgumentException("arrivalAirport cannot be null");
        }

        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureTime()
    {
        return this.departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime)
    {
        if (departureTime == null)
        {
            throw new IllegalArgumentException("departureTime cannot be null");
        }


        this.departureTime = departureTime;
    }

    public Airplane getAirplane()
    {
        return this.airplane;
    }

    public void setAirplane(Airplane airplane)
    {
        if (airplane == null)
        {
            throw new IllegalArgumentException("airplane cannot be null");
        }

        this.airplane = airplane;
    }

    public FlightStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(FlightStatus status)
    {
        if (status == null)
        {
            throw new IllegalArgumentException("status cannot be null");
        }

        this.status = status;
    }

    // method

    public void depart()
    {
        double fuelUsage = this.airplane.getFuelUsage(this);

        if (this.airplane.getFuelLevel() >= fuelUsage)
        {
            this.status = FlightStatus.DEPARTED;
        }

        else
        {
            throw new IllegalArgumentException("not enough fuel for departure");
        }
    }

}
