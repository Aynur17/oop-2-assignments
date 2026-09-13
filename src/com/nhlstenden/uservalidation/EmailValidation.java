package com.nhlstenden.uservalidation;

public class EmailValidation implements Validation
{

    public EmailValidation()
    {
    }

    @Override
    public boolean validate(User user)
    {
        String email = user.getEmail();

        int atIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        return atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1;
    }
}
