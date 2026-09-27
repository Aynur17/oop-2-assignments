package com.nhlstenden.flightbooking;

public class Luggage
{
    private int weight;
    private LuggageType type;


    public Luggage(int weight, LuggageType type)
    {
        this.setWeight(weight);
        this.setType(type);
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void setWeight(int weight)
    {
        if (weight <= 0)
        {
            throw new IllegalArgumentException("weight cannot be 0 or negative");
        }

        this.weight = weight;
    }

    public LuggageType getType()
    {
        return this.type;
    }

    public void setType(LuggageType type)
    {
        if (type == null)
        {
            throw new IllegalArgumentException("luggage type cannot be null");
        }

        this.type = type;
    }
}
