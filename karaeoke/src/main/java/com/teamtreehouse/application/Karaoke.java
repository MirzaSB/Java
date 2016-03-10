package com.teamtreehouse.application;

import com.teamtreehouse.model.Song;
import com.teamtreehouse.model.SongBook;

public class Karaoke {

    public static void main(String[] args) {

        Song song = new Song("Michael Jackson",
                "Beat It", "http://youtube.com/watch?v=SaEC9i0Q0vk");
        SongBook songBook = new SongBook();
        System.out.printf("Adding %s %n", song);
        songBook.addSong(song);
        System.out.printf("There are %d song(s). %n.", songBook.getSongCount());

    }
}
