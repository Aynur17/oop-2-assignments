package com.nhlstenden.flightbooking;

import java.util.ArrayList;
import java.util.List;

public class Person
{
    private String name;
    private List<Luggage> luggage;


    public Person(String name)
    {
        this.setName(name);
        this.luggage = new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("name cannot be null or blank");
        }

        this.name = name;
    }

    public List<Luggage> getLuggage()
    {
        return this.luggage;
    }

    public void addLuggage(Luggage luggage)
    {
        if (luggage == null)
        {
            throw new IllegalArgumentException("luggage cannot be null");
        }

        if (luggage.getType().equals(LuggageType.CARRY_ON))
        {
            for (Luggage exists : this.luggage)
            {
                if(exists.getType() == LuggageType.CARRY_ON)
                {
                    throw new IllegalArgumentException("a person can only have 1 carry on luggage");
                }
            }
        }

        this.luggage.add(luggage);
    }
}
