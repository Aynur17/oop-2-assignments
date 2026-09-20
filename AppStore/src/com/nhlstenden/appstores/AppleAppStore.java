package com.nhlstenden.appstores;

public class AppleAppStore extends AppStore
{
    public AppleAppStore(Currency currency)
    {
        super(currency);
    }

    @Override
    public void uploadApp(App app)
    {
        if (!app.isNudity())
        {
            this.uploadApp(app);
        }
    }
}
