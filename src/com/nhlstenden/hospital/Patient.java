package com.nhlstenden.hospital;

import java.time.LocalDate;

public class Patient
{
    private String name;
    private LocalDate dateOfBirth;
    private String sex;
    private int heartRate;
    private int systolic;
    private int diastolic;
    private boolean canWalk;


    public Patient(String name, LocalDate dateOfBirth, String sex)
    {
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setSex(sex);
        this.setHeartRate(heartRate);
        this.setSystolic(systolic);
        this.setDiastolic(diastolic);
        this.canWalk = canWalk;
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

    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        if (dateOfBirth == null)
        {
            throw new IllegalArgumentException("dateOfBirth cannot be null");
        }

        this.dateOfBirth = dateOfBirth;
    }

    public String getSex()
    {
        return this.sex;
    }

    public void setSex(String sex)
    {
        if (sex == null || sex.isBlank())
        {
            throw new IllegalArgumentException("sex cannot be null or blank");
        }

        if (!sex.equals("M") && !sex.equals("F")) {
            throw new IllegalArgumentException("sex must be M or F");
        }
    }

    public int getHeartRate()
    {
        return this.heartRate;
    }

    public void setHeartRate(int heartRate)
    {
        this.heartRate = heartRate;
    }

    public int getSystolic()
    {
        return this.systolic;
    }

    public void setSystolic(int systolic)
    {
        this.systolic = systolic;
    }

    public int getDiastolic()
    {
        return this.diastolic;
    }

    public void setDiastolic(int diastolic)
    {
        this.diastolic = diastolic;
    }

    public boolean isAbleToWalk()
    {
        return this.canWalk;
    }
}
