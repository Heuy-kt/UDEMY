package com.company.practice.generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public void printLeague(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName() +": " + t.ranking());
        }
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getName() + "already exist in " + getName());
            return false;
        }
        else{
            System.out.println("Adding " + team.getName() + " to league");
            league.add(team);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public League(String name) {
        this.name = name;
    }
}
