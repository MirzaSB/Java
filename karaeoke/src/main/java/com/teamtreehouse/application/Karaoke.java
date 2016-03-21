package com.teamtreehouse.application;

import com.teamtreehouse.KaraokeMachine;
import com.teamtreehouse.model.Song;
import com.teamtreehouse.model.SongBook;

public class Karaoke {

    public static void main(String[] args) {
        String filename = "songs.txt";
        //Song song = new Song("Michael Jackson",
                //"Beat It", "http://youtube.com/watch?v=SaEC9i0Q0vk");
        SongBook songBook = new SongBook();
        songBook.importFrom(filename);
        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();
        System.out.println("Saving book.....");
        songBook.exportTo(filename);
    }
}
