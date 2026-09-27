package com.nhlstenden.flightbooking;

public abstract class Airplane
{
    private String code;
    private double fuelLevel;


    public Airplane(String code, double fuelLevel)
    {
        this.setCode(code);
        this.setFuelLevel(fuelLevel);
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(String code)
    {
        if (code == null || code.isBlank())
        {
            throw new IllegalArgumentException("code cannot be null or blank");
        }

        this.code = code;
    }

    public double getFuelLevel()
    {
        return this.fuelLevel;
    }

    public void setFuelLevel(double fuelLevel)
    {
        if (fuelLevel < 0)
        {
            throw new IllegalArgumentException("fuel level cannot be negative");
        }

        this.fuelLevel = fuelLevel;
    }

    public abstract double getFuelUsage(Flight flight);

    public abstract void reserveSeat();

    public abstract boolean hasAvailableSeat();

    public abstract int getTotalSeats();

    public abstract int getSeatsTaken();
}