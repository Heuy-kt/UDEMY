package com.company.practice.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mecury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 288);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365.3334);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        Moon tempMoon = new Moon("Moon", 29);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 2.4);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new Moon("Phobos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new Planet("Saturn", 10430);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptun", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets:  ");
        for (HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getKey().getName());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyType.PLANET));
        System.out.println(body.getKey().getName() + " satellites: ");
        for(HeavenlyBody satellite: body.getSatellites())
            System.out.println("\t" + satellite.getKey().getName());

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("Satellites:");
        for(HeavenlyBody moon: moons)
            System.out.println("\t" + moon.getKey().getName());

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet: planets)
            System.out.println(planet);
//            System.out.println(planet.getName()+ " : " + planet.getOrbitalPeriod());

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 325);

        System.out.println("this solar system contains: ");
        for(HeavenlyBody bodies : solarSystem.values()){
            System.out.println(bodies);

        }

//        System.out.println(earth2.equals(pluto));
//        System.out.println(pluto.equals(earth2));
    }
}
