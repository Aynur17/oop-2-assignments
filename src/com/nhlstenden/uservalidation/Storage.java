package com.nhlstenden.uservalidation;

import java.util.ArrayList;
import java.util.List;

public class Storage
{
    private List<User> users;


    public Storage()
    {
        this.users = new ArrayList<>();
    }

    public void addUser(User user)
    {
        if (user == null)
        {
            throw new IllegalArgumentException("user cannot be null");
        }

        this.users.add(user);
    }

    public boolean usernameExists(String username)
    {
        for (User user : users)
        {
            if (user.getUsername().equals(username))
            {
                return true;
            }
        }

        return false;
    }
}
