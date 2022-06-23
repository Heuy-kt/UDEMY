package com.company.udemy.songChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private static final ArrayList<Song> ALBUM = new ArrayList<>();
    private String albumName;

    public Album(String albumName) {
        this.albumName = albumName;
    }

    public void addSongToAlbum(Song song){
        if(findSong(song)< 0 && song.getAlbum().equals(getAlbumName())) {
            ALBUM.add(song);
            System.out.println("Song added");
        }else if(findSong(song) < 0){
            System.out.println("Song is not in this album");
        }else{
            System.out.println("Song already exist");
        }
    }

    public Song getSongFromAlbum(int trackId){
        if(trackId > 0 && trackId < ALBUM.size())
            return ALBUM.get(trackId);
        return null;
    }

    public void printAll(){
        for(int i = 0; i<= ALBUM.size()-1; i++){
            System.out.println("Song: " + ALBUM.get(i).getTitle()+ " Artist: " + ALBUM.get(i).getArtist());
        }
    }

    private int findSong(Song song){
        if(ALBUM.contains(song))
            return ALBUM.indexOf(song);
        return -1;
    }

    private int findSong(String songName){
        for(int i = 0; i<= ALBUM.size()-1; i++) {
            if (songName.equals(ALBUM.get(i).getTitle()))
                return i;
        }
        return -1;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getPlayListName(LinkedList<Song> playList){
        if(!playList.isEmpty())
            return playList.get(0).getTitle();
        return "Playlist doesn't exist ir is empty";
    }

    public void addSongToPlaylist(LinkedList<Song> playlist, String songTitle, Album album){
        addSongToPlaylist(playlist, findSong(songTitle), album);

    }

    public void addSongToPlaylist(LinkedList<Song> playlist, int trackId,  Album album){
        if(getSongFromAlbum(trackId) != null){
            playlist.add(album.getSongFromAlbum(trackId));
        }else{
            System.out.println("Song already on playlist");
        }
    }

    public void removeSongFromPlaylist(LinkedList<Song> playlist, String songName){
        int index = findSongOnPlaylist(playlist, songName);
        if(index >= 0){
            Song song = playlist.get(index);
            playlist.remove(song);
        }
        else{
            System.out.println("Song doesn't exist in playlist");
        }
    }

    public void removeSongFromPlaylist(LinkedList<Song> playlist, int trackId){
        if(trackId >= 0){
            Song song = playlist.get(trackId);
            playlist.remove(song);
        }
        else{
            System.out.println("Song doesn't exist in playlist");
        }
    }

    public void printListOfSongs(LinkedList<Song> playlist){
        ListIterator<Song> playIterator = playlist.listIterator();
        if(!playlist.isEmpty()){
            while(playIterator.hasNext()){
                System.out.println( playIterator.next().getTitle() + " "
                        + playIterator.next().getArtist() + " "
                        + playIterator.next().getAlbum() );
            }
        }else{
            System.out.println(getPlayListName(playlist));
        }
    }

    private int findSongOnPlaylist(LinkedList<Song> playlist, Song song){
        if(playlist.contains(song)){
            return playlist.indexOf(song);
        }
        return -1;
    }

    private int findSongOnPlaylist(LinkedList<Song> playlist, String songName){
        for(Song song : playlist){
            if(song.getTitle().equals(songName))
                return findSongOnPlaylist(playlist, song);
        }
        return -1;
    }
}
