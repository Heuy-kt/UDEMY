package com.company.udemy.songChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello world");

    Song airplanes = new Song("Airplanes", 4.12, "Eminem", "fast");
    Song older = new Song("Older", 3.12, "Sasha Sloan", "myself");
    Song baddo = new Song("Baddo", 4.23, "Olamide baddo", "baddo");
    Song devil = new Song("Devils", 3.20, "Eminem", "fast");
    Song rapGod = new Song("Rap god", 5.00, "Eminem", "fast");
    Song crazy = new Song("Crazy", 5.01, "Eminem", "fast");

    Album fast = new Album("fast");
    fast.addSongToAlbum(airplanes);
    fast.addSongToAlbum(baddo);
    fast.addSongToAlbum(devil);
    fast.addSongToAlbum(airplanes);

    fast.printAll();
    }
}
