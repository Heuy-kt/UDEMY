package com.company.udemy.learningInterfaceChallenge;

import java.util.ArrayList;

public class PlayerStorage implements ISavable{
    public static final ArrayList<Object> PLAYERS = new ArrayList<>();

    @Override
    public void printStorage() {
        for(Object object : PLAYERS){
            System.out.println(object.toString());
        }

    }

    @Override
    public void saveObject(Object object) {
        PLAYERS.add(object);
    }


}
