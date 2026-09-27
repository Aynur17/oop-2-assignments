package com.nhlstenden.appstores;

import java.util.ArrayList;
import java.util.List;

public abstract class AppStore
{
    private static final double REVENUE_PERCENTAGE = 0.70;

    private Currency currency;
    private List<App> apps;
    private List<Purchase> purchases;


    public AppStore(Currency currency)
    {
        this.setCurrency(currency);
        this.setApps(new ArrayList<>());
        this.setPurchases(new ArrayList<>());
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
        this.getApps().add(app);
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

        this.getPurchases().add(purchase);
    }

    public double getTotalRevenue()
    {
        double totalRevenue = 0;

        for (Purchase purchase : this.getPurchases())
        {
            totalRevenue += purchase.getPrice() * REVENUE_PERCENTAGE;
        }

        return totalRevenue;
    }

    public double getRevenue(App app)
    {
        double revenue = 0;

        for (Purchase purchase : this.getPurchases())
        {
            if (purchase.getApp() == app)
            {
                revenue += purchase.getPrice() * REVENUE_PERCENTAGE;
            }
        }

        return revenue;
    }

    public void setApps(List<App> apps)
    {
        if (apps == null || apps.isEmpty())
        {
            throw new IllegalArgumentException("apps cannot be null or empty");
        }

        for (Object appsItem : apps)
        {
            if (appsItem == null)
            {
                throw new IllegalArgumentException("apps cannot be null");
            }
        }

        this.apps = new ArrayList<>(apps);
    }

    public void setPurchases(List<Purchase> purchases)
    {
        if (purchases == null || purchases.isEmpty())
        {
            throw new IllegalArgumentException("purchases cannot be null or empty");
        }

        for (Object purchasesItem : purchases)
        {
            if (purchasesItem == null)
            {
                throw new IllegalArgumentException("purchases cannot be null");
            }
        }

        this.purchases = new ArrayList<>(purchases);
    }
}
