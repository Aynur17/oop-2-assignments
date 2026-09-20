package com.nhlstenden.appstores;

public class App
{
    private static final int MIN_AGE_VIOLENCE_APPS = 16;
    private static final int MIN_AGE_NUDITY_APPS = 18;

    private String name;
    private double price;
    private boolean violence;
    private boolean nudity;


    public App(String name, double price, boolean violence, boolean nudity)
    {
        this.setName(name);
        this.setPrice(price);
        this.setViolence(violence);
        this.setNudity(nudity);
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

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        if (price < 0)
        {
            throw new IllegalArgumentException("price cannot be negative");
        }

        this.price = price;
    }

    public boolean isViolence()
    {
        return violence;
    }

    public void setViolence(boolean violence)
    {
        this.violence = violence;
    }

    public boolean isNudity()
    {
        return nudity;
    }

    public void setNudity(boolean nudity)
    {
        this.nudity = nudity;
    }

    public boolean isUserAllowedToDownload(User user)
    {
        int age = user.getAge();

        if (this.nudity && age < MIN_AGE_NUDITY_APPS)
        {
            return false;
        }

        if (this.violence && age < MIN_AGE_VIOLENCE_APPS)
        {
            return false;
        }

        return true;
    }
}
