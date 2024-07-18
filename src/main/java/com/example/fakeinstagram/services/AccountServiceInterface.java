package com.example.fakeinstagram.services;

import com.example.fakeinstagram.entities.Account;

public interface AccountServiceInterface {
    Account signup(Account user);

    Account login(Account user);
}
