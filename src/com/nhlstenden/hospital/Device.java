package com.nhlstenden.hospital;

public abstract class Device
{
    private String serialNumber;
    private double energyConsumption;


    public Device(String serialNumber, double energyConsumption)
    {
        this.serialNumber = serialNumber;
        this.energyConsumption = energyConsumption;
    }

    public String getSerialNumber()
    {
        return this.serialNumber;
    }

    public double getEnergyConsumption()
    {
        return energyConsumption;
    }

    public abstract String monitor(Patient patient);
}
