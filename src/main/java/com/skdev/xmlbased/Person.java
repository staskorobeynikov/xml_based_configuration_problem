package com.skdev.xmlbased;

public class Person {
    private String name;
    private Role role;
    private Country country;
    private Company company;
    private Account account;

    public Person() {
    }

    public Person(String name, Role role, Country country, Company company, Account account) {
        this.name = name;
        this.role = role;
        this.country = country;
        this.company = company;
        this.account = account;
    }

    public void printNamesPets() {
        System.out.println("Person Name = " + name);
        System.out.println("role = " + role.getName());
        System.out.println("country = " + country.getName());
        System.out.println("account = " + account.getName());
        System.out.println("company = " + company.getName());
    }
}
