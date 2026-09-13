package com.nhlstenden.uservalidation;

import java.time.LocalDate;

public class User
{
    private String username;
    private String password;
    private String email;
    private LocalDate dateOfBirth;


    public User(String username, String password, String email, LocalDate dateOfBirth)
    {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setDateOfBirth(dateOfBirth);
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        if (username == null || username.isBlank())
        {
            throw new IllegalArgumentException("name cannot be null or blank");
        }

        this.username = username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        if (password == null || password.isBlank())
        {
            throw new IllegalArgumentException("password cannot be null or blank");
        }

        this.password = password;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        if (email == null || email.isBlank())
        {
            throw new IllegalArgumentException("email cannot be null or blank");
        }

        this.email = email;
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
}
