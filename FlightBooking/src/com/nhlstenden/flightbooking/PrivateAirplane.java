package com.nhlstenden.flightbooking;

public class PrivateAirplane extends Airplane
{
    private static final double FUEL_PER_SEAT = 1.31;
    private static final double FUEL_PER_SEAT_TAKEN = 1.87;
    private static final double FUEL_PER_KG_LUGGAGE = 0.4;

    private int numOfSeats;
    private int numOfSeatsTaken;

    public PrivateAirplane(String code, double fuelLevel, int numOfSeats)
    {
        super(code, fuelLevel);
        this.setNumOfSeats(numOfSeats);
        this.setNumOfSeatsTaken(numOfSeatsTaken);
    }

    @Override
    public double getFuelUsage(Flight flight)
    {
        return 0;
    }

    @Override
    public void reserveSeat()
    {
        if (this.numOfSeatsTaken < this.numOfSeats)
        {
            this.numOfSeatsTaken++;
        }

        else
        {
            throw new IllegalArgumentException("no seats left");
        }
    }

    @Override
    public boolean hasAvailableSeat()
    {
        return this.numOfSeatsTaken < this.numOfSeats;
    }

    @Override
    public int getTotalSeats()
    {
        return this.numOfSeats;
    }

    @Override
    public int getSeatsTaken()
    {
        return this.numOfSeatsTaken;
    }

    public int getNumOfSeats()
    {
        return this.numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats)
    {
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeatsTaken()
    {
        return this.numOfSeatsTaken;
    }

    public void setNumOfSeatsTaken(int numOfSeatsTaken)
    {
        this.numOfSeatsTaken = numOfSeatsTaken;
    }

}
