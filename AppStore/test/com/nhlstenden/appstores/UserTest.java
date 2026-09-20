package com.nhlstenden.appstores;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest
{

    @Test
    public void getAge_returnsCorrectAge()
    {
        User user = new User(
                "Name",
                "example@gmail.com",
                LocalDate.of(2000, 1, 1)
        );

        assertEquals(26, user.getAge());
    }

    @Test
    public void validEmail_returnsEmail()
    {
        String email = EmailValidation.validateEmail("test@gmail.com");

        assertEquals("test@gmail.com", email);
    }

    @Test
    public void invalidEmail_returnsNull()
    {
        String email = EmailValidation.validateEmail("testgmail.com");

        assertNull(email);
    }
}