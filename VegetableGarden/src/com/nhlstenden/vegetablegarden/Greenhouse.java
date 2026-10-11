package com.nhlstenden.vegetablegarden;

public class Greenhouse extends Garden
{
    public void runWeather()
    {
        int lux = WeatherGenerator.getRandomLux();
        int mm = WeatherGenerator.getRandomMm();

        for (Vegetable vegetable : getVegetables())
        {
            vegetable.grow(lux, mm, 1);
        }
    }
}
