package com.nhlstenden.appstores;

public class EmailValidation
{
    public static String validateEmail(String email)
    {
        if (email == null)
        {
            return null;
        }

        if (email.contains("@") && email.contains("."))
        {
            return email;
        }

        return null;
    }
}
