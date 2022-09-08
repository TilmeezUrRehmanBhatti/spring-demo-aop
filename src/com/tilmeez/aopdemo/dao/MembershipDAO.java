package com.tilmeez.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addAccount() {

        System.out.println(getClass() + ": DOING STUFF: ADD A MEMBERSHIP ACCOUNT");

        return true;
    }
}












