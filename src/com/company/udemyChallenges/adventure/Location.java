package com.company.udemyChallenges.adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {

private final int LOCATION_ID;
private final String DESCRIPTION;
private final Map<String, Integer> EXITS;

    public Location(int location_id, String description) {
        LOCATION_ID = location_id;
        DESCRIPTION = description;
        EXITS = new HashMap<String, Integer>();
        addExits("Q", 0);
    }

    public void addExits(String direction, int location){
        EXITS.put(direction, location);
    }
    public int getLOCATION_ID() {
        return LOCATION_ID;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Map<String, Integer> getEXITS() {
        return new HashMap<String, Integer>(EXITS);
    }
}
