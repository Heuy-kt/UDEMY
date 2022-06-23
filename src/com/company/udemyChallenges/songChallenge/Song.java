package com.company.udemyChallenges.songChallenge;

public class Song {
    private String title;
    private double duration;
    private String artist;
    private String album;

    public Song(String title, double duration, String artist, String album) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
