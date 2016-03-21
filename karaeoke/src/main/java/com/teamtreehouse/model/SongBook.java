package com.teamtreehouse.model;

import java.io.*;
import java.util.*;

public class SongBook {

    private List<Song> mSongs;

    public SongBook() {
        mSongs = new ArrayList<Song>();
    }

    public void exportTo(String filename) {
        try (
                FileOutputStream fos = new FileOutputStream(filename);
                PrintWriter writer = new PrintWriter(fos);
        ) {
            for (Song song : mSongs) {
                writer.printf("%s|%s|%s%n",
                        song.getArtist(),
                        song.getTitle(),
                        song.getVideoUrl());
            }
        } catch (IOException e) {
            System.out.printf("Problem saving %s %n", filename);
            e.printStackTrace();
        }
    }

    public void importFrom(String filename) {
        try (
                FileInputStream fis = new FileInputStream(filename);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        ) {
                String line;
            while((line = reader.readLine()) != null) {
                line.split("\\|");
                addSong(new Song(args[0], args[1], args[2]));
            }

        } catch (IOException e) {
            System.out.printf("Problem loading %s %n", filename);
            e.printStackTrace();

        }
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public int getSongCount() {
        return mSongs.size();
    }

    /**
     * FIX ME. This should be cached
     **/
    private Map<String, List<Song>> byArtist() {
        Map<String, List<Song>> byArtist = new HashMap<>();
        for (Song song : mSongs) {
            List<Song> artistSongs = byArtist.get(song.getArtist());
            if (artistSongs == null) {
                artistSongs = new ArrayList<>();
                byArtist.put(song.getArtist(), artistSongs);
            }
            artistSongs.add(song);
        }
        return byArtist;
    }

    public Set<String> getArtists() {
        return byArtist().keySet();
    }

    public List<Song> getSongsForArtists(String artistName) {
        return byArtist().get(artistName);
    }

}
