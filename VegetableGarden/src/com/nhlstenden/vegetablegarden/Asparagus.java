package com.nhlstenden.vegetablegarden;

public class Asparagus extends Vegetable
{
    private static final int MARKETABLE_SIZE = 29;

    public Asparagus(double sizeInCm, double cmPerLux, double cmPerMillimeter, int ripeLength, Color color, Status status)
    {
        super(sizeInCm, cmPerLux, cmPerMillimeter, ripeLength, color, status);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays)
    {
        if (getStatus() == Status.DESTROYED)
        {
            return;
        }

        if (mm < 14 && amountOfDays >= 10)
        {
            setStatus(Status.DESTROYED);
            return;
        }

        double growth = (lux * getCmPerLux() + mm * getCmPerMillimeter()) * amountOfDays;

        setSizeInCm(getSizeInCm() + growth);

        if (getSizeInCm() > getRipeLength())
        {
            setStatus(Status.READY_TO_HARVEST);
        }
    }

    @Override
    public boolean isMarketable()
    {
        return !(getSizeInCm() > MARKETABLE_SIZE);
    }
}
