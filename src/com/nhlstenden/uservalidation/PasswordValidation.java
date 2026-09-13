package com.nhlstenden.uservalidation;

public class PasswordValidation implements Validation
{
    private boolean allowSpaces;
    private boolean requireSpecialCharacters;
    private boolean requireNumbers;
    private boolean requireLowerCase;
    private boolean requireUpperCase;


    public PasswordValidation(boolean allowSpaces, boolean requireSpecialCharacters, boolean requireNumbers, boolean requireLowerCase, boolean requireUpperCase)
    {
        this.allowSpaces = allowSpaces;
        this.requireSpecialCharacters = requireSpecialCharacters;
        this.requireNumbers = requireNumbers;
        this.requireLowerCase = requireLowerCase;
        this.requireUpperCase = requireUpperCase;
    }

    @Override
    public boolean validate(User user)
    {
        String password = user.getPassword();

        if (!this.allowSpaces && password.contains(" "))
        {
            return false;
        }

        if (this.requireNumbers && !password.matches(".*\\d.*"))
        {
            return false;
        }

        if (this.requireLowerCase && !password.matches(".*[a-z].*"))
        {
            return false;
        }

        if (this.requireUpperCase && !password.matches(".*[A-Z].*"))
        {
            return false;
        }

        if (this.requireSpecialCharacters && !password.matches(".*[^a-zA-Z0-9\\s].*"))
        {
            return false;
        }

        return true;
    }
}
