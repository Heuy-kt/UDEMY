package com.company.practice.sets;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellites(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyType.MOON){
            return super.addSatellites(moon);
        }
        return false;
    }
}
