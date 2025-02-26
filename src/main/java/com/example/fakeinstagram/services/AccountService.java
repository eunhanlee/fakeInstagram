package com.example.fakeinstagram.services;


import com.example.fakeinstagram.daos.AccountDaoInterface;
import com.example.fakeinstagram.entities.Account;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountService implements AccountServiceInterface {

    @Autowired
    private AccountDaoInterface accountDaoInterface;

    @Override
    public Account signup(Account user) {

        Account newUser = new Account();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setFullName(user.getPassword());
        if (user.getPhoneNumber() != null) newUser.setPhoneNumber(user.getPhoneNumber());
        if (user.getEmail() != null) newUser.setEmail(user.getEmail());

        accountDaoInterface.save(newUser);
        return newUser;
    }

    @Override
    public Account login(Account user) {
        return null;
    }
}
