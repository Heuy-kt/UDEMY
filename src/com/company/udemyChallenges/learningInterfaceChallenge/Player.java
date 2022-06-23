package com.company.udemyChallenges.learningInterfaceChallenge;

public class Player {
    private String name;
    private int health;
    private double height;
    private boolean alive;

    public Player(String name, double height, boolean alive) {
        this.name = name;
        this.health = 100;
        this.height = height;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health>100)
            setHealth(100);
        else if(health<0)
            setHealth(0);
        this.health = health;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String isAlive() {
        if (this.health > 0 && this.alive == true) {
            return " Player is alive ";
        }
        return" player is dead";
    }

    public void setAlive(boolean alive) {
        if(!alive){
            this.health  = 0;
        }
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Player{   " + "Name: " +
                name  + "   Health: " +
                health + "  " + "Height: " +
                height + "  " + "Living status: " +
                isAlive() +
                '}';
    }
}
