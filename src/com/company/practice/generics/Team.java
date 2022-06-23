package com.company.practice.generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
//    Comparable<Team>: we can only compare classes that instantiate team
//    Comparable<Team<T>> we can only compare the same type of object, football to football, soccer to soccer.

    /*
        how this works
        immediately a team class is instantiated, the T is replaced by the class we create with it.
        creating Team<String> and T = String.
        but if T extends an abstract class, it only takes class that extends these classes. <T extends Player>
        creating Team<String> give red line
        creating Team<FootballPlayer> works perfectly
     */
    private String name;
    private int played = 0;
    private int lost = 0;
    private int won = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();
    //only the class declared in Team<T> can be added here

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        //this means player is an object from a class that extends Player(from Team<T extends Player>
        if(members.contains(player)){
            System.out.println(player.getName() + " is already a member");
            return false;
        }else {
            members.add(player);
            System.out.println(((Player)player).getName() + " added");
            return true;
        }
    }
    public int memberSize(){
        return members.size();
    }

    public void playMatch(Team<T> oppo, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            System.out.println(getName() + " won this match");
            won++;
        } else if(ourScore<theirScore) {
            System.out.println(getName() + " lost ");
            lost++;
        }
         else if(ourScore == theirScore) {
            System.out.println("draw");
            tied++;
        }
        played++;
        if(oppo != null){
            oppo.playMatch(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*3 + tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() == team.ranking()){
            return 0;
        }else
            return 1;
    }
}
