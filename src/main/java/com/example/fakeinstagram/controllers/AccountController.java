package com.example.fakeinstagram.controllers;

import com.example.fakeinstagram.entities.Account;
import com.example.fakeinstagram.services.AccountServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private AccountServiceInterface accountServiceInterface;

    @Autowired
    public AccountController(AccountServiceInterface accountServiceInterface) {
        this.accountServiceInterface = accountServiceInterface;
    }

    @PostMapping("emailsignup/")
    public  ResponseEntity<Account> addUser(@RequestBody Account user) {
        Account addedUser = accountServiceInterface.signup(user);
        return ResponseEntity.ok(addedUser); //200
    }

    @PostMapping("login/")
    public  ResponseEntity<Account> login(@RequestBody Account user) {
        Account loginUser = accountServiceInterface.login(user);
        return ResponseEntity.ok(loginUser); //200
    }

}
