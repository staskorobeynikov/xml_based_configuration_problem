package com.skdev.xmlbased;

public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void postConstruct() {
        System.out.println("bean Role method postConstruct()");
    }

    public void preDestroy() {
        System.out.println("bean Role method preDestroy()");
    }
}
