package com.skdev.xmlbased;

public class Country {
    private String name;

    private Country() {
    }

    public static Country createCountry(String name) {
        Country country = new Country();
        country.name = name;
        return country;
    }

    public String getName() {
        return name;
    }
}
