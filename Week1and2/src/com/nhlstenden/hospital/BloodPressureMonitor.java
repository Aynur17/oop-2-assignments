package com.nhlstenden.hospital;

public class BloodPressureMonitor extends Device
{
    public BloodPressureMonitor(String serialNumber, double energyConsumption)
    {
        super(serialNumber, energyConsumption);
    }

    @Override
    public String monitor(Patient patient)
    {
        int systolic = patient.getSystolic();
        int diastolic = patient.getDiastolic();

        if (systolic > 180 || diastolic > 110)
        {
            return "critical";
        }
        else if (systolic > 140 || systolic < 120 || diastolic > 90 || diastolic < 80)
        {
            return "warning";
        }
        else
        {
            return "normal";
        }
    }
}
