package com.nhlstenden.uservalidation;

import java.util.ArrayList;
import java.util.List;

public class UserValidator
{
    private List<Validation> validations;


    public UserValidator()
    {
        this.validations = new ArrayList<>();
    }

    public void addValidation(Validation validation)
    {
        if (validation == null)
        {
            throw new IllegalArgumentException("validation cannot be null");
        }

        this.validations.add(validation);
    }

    public boolean validate(User user)
    {
        for (Validation validation : validations)
        {
            if(!validation.validate(user))
            {
                return false;
            }
        }

        return true;
    }
}
