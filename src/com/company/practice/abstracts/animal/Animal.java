package com.company.practice.abstracts;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sleep();
    public abstract void eat();

    public String getName() {
        return name;
    }
}
