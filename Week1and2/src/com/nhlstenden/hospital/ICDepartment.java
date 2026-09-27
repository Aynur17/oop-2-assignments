package com.nhlstenden.hospital;

import java.beans.BeanDescriptor;
import java.util.List;

public class ICDepartment
{
    private String location;
    private double fte;
    private List<Bed> beds;


    public ICDepartment(String location, double fte)
    {
        this.setLocation(location);
        this.setFte(fte);
    }

    public String getLocation()
    {
        return this.location;
    }

    public void setLocation(String location)
    {
        if (location == null || location.isBlank())
        {
            throw new IllegalArgumentException("location cannot be null or blank");
        }

        this.location = location;
    }

    public double getFte()
    {
        return this.fte;
    }

    public void setFte(double fte)
    {
        if (fte < 0)
        {
            throw new IllegalArgumentException("fte cannot be zero");
        }

        this.fte = fte;
    }

    public void addBed(Bed bed)
    {
        if (bed == null)
        {
            throw new IllegalArgumentException("bed cannot be null");
        }

        this.beds.add(bed);
    }
}
