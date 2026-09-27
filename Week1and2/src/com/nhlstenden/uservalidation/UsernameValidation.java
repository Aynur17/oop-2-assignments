package com.nhlstenden.uservalidation;

public class UsernameValidation implements Validation
{
    private Storage storage;


    public UsernameValidation(Storage storage)
    {
        this.setStorage(storage);
    }

    public Storage getStorage()
    {
        return this.storage;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    @Override
    public boolean validate(User user)
    {
        return !this.storage.usernameExists(user.getUsername());
    }
}
