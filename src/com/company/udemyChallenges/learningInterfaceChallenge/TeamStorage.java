package com.company.udemyChallenges.learningInterfaceChallenge;

import java.util.ArrayList;

public class TeamStorage implements ISavable{
    public static final ArrayList<Object> TEAMS = new ArrayList<>();

    @Override
    public void printStorage() {
        for(Object object : TEAMS){
            System.out.println(object.toString());
        }
    }

    @Override
    public void saveObject(Object object) {
        TEAMS.add(object);
    }
}
