package com.company.practice.introToIO;

import java.util.HashMap;
import java.util.Map;

public final class Location {

private final int LOCATION_ID;
private final String DESCRIPTION;
private final Map<String, Integer> EXITS;

    public Location(int location_id, String description, Map<String, Integer> exits) {
        LOCATION_ID = location_id;
        DESCRIPTION = description;
        if(exits == null){
            this.EXITS = new HashMap<String, Integer>();
        }else
            EXITS = new HashMap<String, Integer>(exits);
        this.EXITS.put("Q", 0);
    }

    public int getLOCATION_ID() {
        return LOCATION_ID;
    }

    public String getDESCRIPTION(){
        return DESCRIPTION;
    }

    public Map<String, Integer> getEXITS() {
        return new HashMap<String, Integer>(EXITS);
    }
}
