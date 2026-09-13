package com.nhlstenden.uservalidation;

import java.time.LocalDate;
import java.time.Period;

public class AgeValidation implements Validation
{
    private int minimumAge;


    public AgeValidation(int minimumAge)
    {
        this.setMinimumAge(minimumAge);
    }

    public int getMinimumAge()
    {
        return this.minimumAge;
    }

    public void setMinimumAge(int minimumAge)
    {
        this.minimumAge = minimumAge;
    }

    @Override
    public boolean validate(User user)
    {
        LocalDate dateOfBirth = user.getDateOfBirth();

        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

        return age >= this.minimumAge;
    }
}
