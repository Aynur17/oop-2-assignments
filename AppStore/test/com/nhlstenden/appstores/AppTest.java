package com.nhlstenden.appstores;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppTest
{
    @Test
    public void violenceApp_userUnder16_notAllowed()
    {
        User user = new User(
                "Example",
                "example@gmail.com",
                LocalDate.now().minusYears(15)
        );

        App app = new App("Game", 14.50, true, false);

        assertFalse(app.isUserAllowedToDownload(user));
    }

    @Test
    public void violenceApp_user16OrOlder_allowed()
    {
        User user = new User(
                "Example",
                "example@gmail.com",
                LocalDate.now().minusYears(16)
        );

        App app = new App("Game", 10.0, true, false);

        assertTrue(app.isUserAllowedToDownload(user));
    }

    @Test
    public void nudityApp_userUnder18_notAllowed()
    {
        User user = new User(
                "Example",
                "example@gmail.com",
                LocalDate.now().minusYears(17)
        );

        App app = new App("Game", 12.50, false, true);

        assertFalse(app.isUserAllowedToDownload(user));
    }

    @Test
    public void nudityApp_user18OrOlder_allowed()
    {
        User user = new User(
                "John",
                "example@gmail.com",
                LocalDate.now().minusYears(22)
        );

        App app = new App("Game", 12.50, false, true);

        assertTrue(app.isUserAllowedToDownload(user));
    }

    @Test
    public void normalApp_isAllowed()
    {
        User user = new User(
                "Example",
                "example@gmail.com",
                LocalDate.now().minusYears(12)
        );

        App app = new App("Normal", 5.0, false, false);

        assertTrue(app.isUserAllowedToDownload(user));
    }
}