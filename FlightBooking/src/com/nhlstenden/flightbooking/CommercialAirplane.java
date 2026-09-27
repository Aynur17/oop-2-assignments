package com.nhlstenden.flightbooking;

public class CommercialAirplane extends Airplane
{
    private static final double FUEL_PER_ECONOMY_SEAT = 1.75;
    private static final double FUEL_PER_BUSINESS_SEAT = 1.98;
    private static final double FUEL_PER_ECONOMY_SEAT_TAKEN = 2.02;
    private static final double FUEL_PER_BUSINESS_SEAT_TAKEN = 2.87;
    private static final double FUEL_PER_KG_LUGGAGE = 0.3;

    private int economyNumOfSeats;
    private int businessNumOfSeats;
    private int seatsTakenBusiness;
    private int seatsTakenEconomy;

    public CommercialAirplane(String code, double fuelLevel, int economyNumOfSeats, int businessNumOfSeats)
    {
        super(code, fuelLevel);
        this.setEconomyNumOfSeats(economyNumOfSeats);
        this.setBusinessNumOfSeats(businessNumOfSeats);
        this.setSeatsTakenBusiness(seatsTakenBusiness);
        this.setSeatsTakenEconomy(seatsTakenEconomy);

    }

    @Override
    public double getFuelUsage(Flight flight)
    {
        return 0;
    }

    @Override
    public void reserveSeat()
    {
        if (this.getSeatsTakenEconomy() < this.economyNumOfSeats)
        {
            this.setSeatsTakenEconomy(this.getSeatsTakenEconomy() + 1);
        }

        else if (this.getSeatsTakenBusiness() < this.businessNumOfSeats)
        {
            this.setSeatsTakenBusiness(this.getSeatsTakenBusiness() + 1);
        }

        else
        {
            throw new IllegalArgumentException("all seats are occupied");
        }
    }

    @Override
    public boolean hasAvailableSeat()
    {
        return this.getSeatsTakenEconomy() < this.economyNumOfSeats
                || this.getSeatsTakenBusiness() < this.businessNumOfSeats;
    }

    @Override
    public int getTotalSeats()
    {
        return this.businessNumOfSeats + this.economyNumOfSeats;
    }

    @Override
    public int getSeatsTaken()
    {
        return getSeatsTakenBusiness() + getSeatsTakenEconomy();
    }

    public int getEconomyNumOfSeats()
    {
        return this.economyNumOfSeats;
    }

    public void setEconomyNumOfSeats(int economyNumOfSeats)
    {
        if (economyNumOfSeats <= 0)
        {
            throw new IllegalArgumentException("economy number of seats cannot be zero or negative");
        }

        this.economyNumOfSeats = economyNumOfSeats;
    }

    public int getBusinessNumOfSeats()
    {
        return this.businessNumOfSeats;
    }

    public void setBusinessNumOfSeats(int businessNumOfSeats)
    {
        if (businessNumOfSeats <= 0)
        {
            throw new IllegalArgumentException("business number of seats cannot be zero or negative");
        }

        this.businessNumOfSeats = businessNumOfSeats;
    }

    public int getSeatsTakenBusiness()
    {
        return this.seatsTakenBusiness;
    }

    public void setSeatsTakenBusiness(int seatsTakenBusiness)
    {
        if (seatsTakenBusiness < 0)
        {
            throw new IllegalArgumentException("seats taken business cannot be negative");
        }

        this.seatsTakenBusiness = seatsTakenBusiness;
    }

    public int getSeatsTakenEconomy()
    {
        return this.seatsTakenEconomy;
    }

    public void setSeatsTakenEconomy(int seatsTakenEconomy)
    {
        if (seatsTakenEconomy < 0)
        {
            throw new IllegalArgumentException("seats taken economy cannot be negative");
        }

        this.seatsTakenEconomy = seatsTakenEconomy;
    }
}
