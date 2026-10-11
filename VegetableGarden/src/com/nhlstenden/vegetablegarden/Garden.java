package com.nhlstenden.vegetablegarden;

import java.util.HashSet;

public class Garden
{
    private static final int MAX_VEGETABLE_AMOUNT = 27;
    private HashSet<Vegetable> vegetables;


    public Garden()
    {
        this.vegetables = new HashSet<>();
    }

    public HashSet<Vegetable> getVegetables()
    {
        return this.vegetables;
    }

    public void setVegetables(HashSet<Vegetable> vegetables)
    {
        this.vegetables = vegetables;
    }

    public HashSet<Vegetable> getReadyForHarvest()
    {
        HashSet<Vegetable> readyVegetables = new HashSet<>();

        for (Vegetable vegetable : vegetables)
        {
            if (vegetable.getStatus() == Status.READY_TO_HARVEST)
            {
                readyVegetables.add(vegetable);
            }
        }

        return readyVegetables;
    }

    public void plantVegetable(Vegetable vegetable)
    {
        if (vegetables.size() >= MAX_VEGETABLE_AMOUNT)
        {
            throw new TooManyVegetablesException("cannot plant");
        }

        this.vegetables.add(vegetable);
    }
}
