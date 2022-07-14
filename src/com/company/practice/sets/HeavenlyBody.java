package com.company.practice.sets;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {//final classes can' t be subclassed
    private final Key key;
    private final double orbitalPeriod;
    private final HashSet<HeavenlyBody> satellites;

    public enum BodyType{
        MOON,
        STAR,
        PLANET,
        DWARF_PLANET,
        COMET,
        ASTEROIDS
    }

        public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellites(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj instanceof  HeavenlyBody){
            HeavenlyBody thisObject = (HeavenlyBody)obj;
            return this.key.equals(thisObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyType bodyType){
        return new Key(name, bodyType);
    }
    @Override
    public String toString() {
        return this.key.name +": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private BodyType bodyType;

        private Key(String name, BodyType bodyType){
            this.bodyType = bodyType;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }
    }
}
