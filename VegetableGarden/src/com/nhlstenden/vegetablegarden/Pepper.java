package com.nhlstenden.vegetablegarden;

public class Pepper extends Vegetable
{
    private static final int MIN_SIZE = 15;
    private static final int MAX_SIZE = 21;

    public Pepper(double sizeInCm, double cmPerLux, double cmPerMillimeter, int ripeLength, Color color, Status status)
    {
        super(sizeInCm, cmPerLux, cmPerMillimeter, ripeLength, color, status);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays)
    {
        if (mm > 31 && amountOfDays > 4)
        {
            setStatus(Status.DESTROYED);
            return;
        }

        if (mm < 25 & amountOfDays >= 10)
        {
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
        return !(getSizeInCm() < MIN_SIZE) && !(getSizeInCm() > MAX_SIZE);
    }
}
