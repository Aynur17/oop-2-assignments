package com.nhlstenden.appstores;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppStoreTest
{

    @Test
    public void purchaseApp_allowedUser_canPurchaseApp()
            throws DownloadNotAllowedException
    {
        AppStore store = new GoogleAppStore(Currency.EURO);

        User user = new User(
                "Example",
                "example@gmail.com",
                LocalDate.now().minusYears(18)
        );

        App app = new App("Game", 10.0, true, false);

        store.purchaseApp(user, app);

        assertEquals(1, store.getPurchases().size());
    }

    @Test
    public void purchaseApp_underageUser_cannotPurchaseApp()
    {
        AppStore store = new GoogleAppStore(Currency.EURO);

        User user = new User(
                "Example",
                "example@gmail.com",
                LocalDate.now().minusYears(15)
        );

        App app = new App("Game", 10.0, true, false);

        assertThrows(DownloadNotAllowedException.class,
                () -> store.purchaseApp(user, app)
        );
    }
}