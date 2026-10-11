package com.nhlstenden.vegetablegarden;

public class WeatherGenerator
{
    public static int getRandomLux()
    {
        return (int) (Math.random() * (101592 - 1000 + 1) + 1000);
    }

    public static int getRandomMm()
    {
        return (int) (Math.random() * 49);
    }
}
