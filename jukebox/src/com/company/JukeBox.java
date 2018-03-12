package com.company;


import java.io.*;
import java.util.*;

public class JukeBox {
    ArrayList<String> songList = new ArrayList<String>();

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
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
        songList.add(tokens[0]);
    }

}
