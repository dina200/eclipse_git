package com.company;

import java.util.Comparator;

public class Song implements Comparable <Song>{

    private String title;
    private String artist;
    private String rating;
    private String bpm;

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getRating() {
        return this.rating;
    }

    public String getBpm() {
        return this.bpm;
    }

    public Song(String title, String artist, String rating, String bpm){
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return this.title + " / " + this.artist;
    }

    @Override
    public int compareTo(Song s) {
        return this.title.compareTo(s.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        Song song = (Song) o;
        return this.getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
