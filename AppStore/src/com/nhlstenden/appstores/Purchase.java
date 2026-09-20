package com.nhlstenden.appstores;

public class Purchase
{
    private User user;
    private App app;
    private double price;


    public Purchase(User user, App app, double price)
    {
        this.setUser(user);
        this.setApp(app);
        this.setPrice(price);
    }

    public User getUser()
    {
        return this.user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public App getApp()
    {
        return this.app;
    }

    public void setApp(App app)
    {
        this.app = app;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
