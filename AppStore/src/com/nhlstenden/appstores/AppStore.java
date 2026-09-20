package com.nhlstenden.appstores;

import java.util.ArrayList;
import java.util.List;

public class AppStore
{
    private static final double REVENUE_PERCENTAGE = 0.70;

    private Currency currency;
    private List<App> apps;
    private List<Purchase> purchases;


    public AppStore(Currency currency)
    {
        this.setCurrency(currency);
        this.apps = new ArrayList<>();
        this.purchases = new ArrayList<>();
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public void setCurrency(Currency currency)
    {
        this.currency = currency;
    }

    public List<App> getApps()
    {
        return apps;
    }

    public List<Purchase> getPurchases()
    {
        return purchases;
    }

    public void uploadApp(App app)
    {
        this.apps.add(app);
    }

    public void purchaseApp(User user, App app) throws DownloadNotAllowedException
    {
        if (!app.isUserAllowedToDownload(user))
        {
            throw new DownloadNotAllowedException();
        }

        Purchase purchase = new Purchase(
                user, app, app.getPrice()
        );

        this.purchases.add(purchase);
    }

    public double getTotalRevenue()
    {
        double totalRevenue = 0;

        for (Purchase purchase : this.purchases)
        {
            totalRevenue += purchase.getPrice() * REVENUE_PERCENTAGE;
        }

        return totalRevenue;
    }

    public double getRevenue(App app)
    {
        double revenue = 0;

        for (Purchase purchase : this.purchases)
        {
            if (purchase.getApp() == app)
            {
                revenue += purchase.getPrice() * REVENUE_PERCENTAGE;
            }
        }

        return revenue;
    }
}
