package com.nhlstenden.hospital;

public class HeartMonitor extends Device
{
    public HeartMonitor(String serialNumber, double energyConsumption)
    {
        super(serialNumber, energyConsumption);
    }

    @Override
    public String monitor(Patient patient)
    {
        int heartRate = patient.getHeartRate();
        String sex = patient.getSex();

        if (sex.equals("F"))
        {
            if (heartRate >= 70 && heartRate <= 80)
            {
                return "normal";
            }
            else if (heartRate > 80 && heartRate <= 110)
            {
                return "warning";
            }
            else
            {
                return "critical";
            }
        }
        else
        {
            if (heartRate >= 60 && heartRate <= 75)
            {
                return "normal";
            }
            else if (heartRate > 75 && heartRate <= 100)
            {
                return "warning";
            }
            else
            {
                return "critical";
            }
        }
    }
}