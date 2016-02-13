package com.teamtreehouse;

import java.util.Arrays;
import java.util.Date;

public class Example {

    public static void main(String[] args) {
        Treet treet = new Treet("craigdennis", "Want to be famous? Simply tweet "
                + "about Java and use the hashtag #treet. I'll use your tweet "
                + "in a new @treehouse course about data structures.", 
                new Date(1421849732000l));

        Treet secondTreet = new Treet("journeytocode", "@treehouse makes learning Java soooo fun! #treet",
                new Date(1455323677000l));



        //System.out.println(treet.toString());
        //Object obj = treet;
        //Treet another = (Treet) obj;
        //Object[] someStuff = {treet, "a string"};

        Treet[] treets = {secondTreet, treet};
        Arrays.sort(treets);
        //for(Treet exampleTreet : treets) {
            //System.out.println(exampleTreet);
        //}
        
        Treets.save(treets);
        Treet[] reloadedTreets = Treets.load();
        for(Treet reloaded : reloadedTreets) {
            System.out.println(reloaded);
        }

    }
}
