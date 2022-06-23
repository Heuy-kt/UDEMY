package com.company.practice.abstracts;

public abstract class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Lying down and snoring");
    }

    @Override
    public void eat() {
        System.out.println("chewing, dropping, pick and chewing again");
    }
    public abstract void mate();
}
