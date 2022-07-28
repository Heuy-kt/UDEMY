package com.company.practice.introToIO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "Ending adventure game", null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "On the start road", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "Climbing up the hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "Entering the building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "Moving towards the valley", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "Deep in the deep dark forest", tempExit));
//        tempExit = new HashMap<String, Integer>();


        Map<String, String> vocabulary = new HashMap();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("QUIT", "Q");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDESCRIPTION());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getEXITS();
            System.out.print("Available exits are: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            System.out.println("Enter your directions please");
            String direction = scanner.nextLine().toUpperCase();
            String[] directions = direction.split(" ");
            String nextLocation = "";
            for (String direct : directions) {
                if (vocabulary.containsKey(direct)){
                    nextLocation = vocabulary.get(direct);
                }else
                    nextLocation = nextLocation;
            }
            if (exits.containsKey(nextLocation)){
                loc = exits.get(nextLocation);
            }else{
                System.out.println("You cant go in this directions");
            }
        }
    }
}

//to make a class fully immutable:
//1. provide no setters
//2. make all fields private and final
//3. declare classes final also, dont allow the classes to be subclassed
//4. don't provide objects that modify mutable objects (like setters too)
//5. don't share references to mutable objects