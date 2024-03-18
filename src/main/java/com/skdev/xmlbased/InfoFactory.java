package com.skdev.xmlbased;

public class InfoFactory {
    public Company getCompany(String name) {
        return new Company(name);
    }

    public Account getAccount(String name) {
        return new Account(name);
    }
}
