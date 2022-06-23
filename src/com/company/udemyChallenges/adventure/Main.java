package com.company.udemyChallenges.adventure;

import java.util.*;

public class Main {

    private static Map<Integer, Location> locations = new HashMap();

    public static void main(String[] args) {


        System.out.println("  ".toUpperCase());
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "Ending adventure game"));
        locations.put(1, new Location(1, "On the start road"));
        locations.put(2, new Location(2, "Climbing up the hill"));
        locations.put(3, new Location(3, "Entering the building"));
        locations.put(4, new Location(4, "Moving towards the valley"));
        locations.put(5, new Location(5, "Deep in the deep dark forest"));

        locations.get(1).addExits("W", 2);
        locations.get(1).addExits("E", 3);
        locations.get(1).addExits("S", 4);
        locations.get(1).addExits("N", 5);

        locations.get(2).addExits("N", 5);

        locations.get(3).addExits("W", 1);

        locations.get(4).addExits("W", 2);
        locations.get(4).addExits("N", 1);

        locations.get(5).addExits("W", 2);
        locations.get(5).addExits("S", 1);


        int loc = 1;
        Map<String, String> vocabulary = new HashMap();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("QUIT", "Q");

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
