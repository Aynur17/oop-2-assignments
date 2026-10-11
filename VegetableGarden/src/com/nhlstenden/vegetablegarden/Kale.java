package com.nhlstenden.vegetablegarden;

public class Kale extends Vegetable
{
    public Kale(double sizeInCm, double cmPerLux, double cmPerMillimeter, int ripeLength, Color color, Status status)
    {
        super(sizeInCm, cmPerLux, cmPerMillimeter, ripeLength, color, status);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays)
    {
        if (mm >= 40 && amountOfDays >= 6)
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
        return false;
    }
}
