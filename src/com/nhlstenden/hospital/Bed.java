package com.nhlstenden.hospital;

import java.util.ArrayList;
import java.util.List;

public class Bed
{
    private List<Device> devices;
    private Patient patient;

    public Bed(List<Device> devices, Patient patient)
    {
        this.devices = new ArrayList<>();
        this.patient = null;
    }


    public Patient getPatients()
    {
        return this.patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    public List<Device> getDevices()
    {
        return this.devices;
    }

    public void addDevice(Device device)
    {
        if (device == null)
        {
            throw new IllegalArgumentException("device cannot be null");
        }

        this.devices.add(device);
    }

    public boolean isOccupied()
    {
        return this.patient != null;
    }
}
