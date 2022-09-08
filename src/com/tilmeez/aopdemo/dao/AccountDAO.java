package com.tilmeez.aopdemo.dao;

import com.tilmeez.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account theAccount) {

        System.out.println(getClass() + ": DOING MY DEB WORK: ADDING AN ACCOUNT");

    }
}
