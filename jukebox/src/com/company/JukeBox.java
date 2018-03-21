package com.company;


import java.io.*;
import java.util.*;

public class JukeBox {
    ArrayList<Song> songList = new ArrayList<Song>();



    public void go(){
        getSongs();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare ac = new ArtistCompare();
        Collections.sort(songList, ac);
        System.out.println(songList);

        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    private void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song (tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    class ArtistCompare implements Comparator<Song>{

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }

}
