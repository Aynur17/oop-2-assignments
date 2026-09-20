package com.nhlstenden.appstores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleAppStoreTest
{

    @Test
    public void appleStore_cannotUploadNudityApp()
    {
        AppleAppStore store = new AppleAppStore(Currency.EURO);
        App app = new App("Game", 10.0, false, true);

        store.uploadApp(app);

        assertFalse(store.getApps().contains(app));
    }
}