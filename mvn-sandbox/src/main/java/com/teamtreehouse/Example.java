package com.teamtreehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.teamtreehouse.Treet;

public class Example {

    public static void main(String[] args) {
        
        Treet treet = new Treet("craigdennis", "Want to be famous? Simply tweet "
                + "about #java and use the hashtag #treet. I'll use your tweet "
                + "in a new @treehouse course about data structures.", 
                new Date(1421849732000l));

        Treet secondTreet = new Treet("journeytocode", "@treehouse makes learning #java soooo fun! #treet",
                new Date(1455323677000l));
        
        Treet thirdTreet = new Treet("unknown", "The golden rule in #java isn't #treet others "
                + "as you want to be treated. The golden rule is don't repeat "
                + "yourself.", new Date(1421949732000l));
        
        Treet fourthTreet = new Treet("doe", "Can not wait to pick up the missing skills #data #java #treet @craigdennis @MohammedOokiyo",
                new Date(144552367700l));
        
        Treet fifthTreet = new Treet("craigdennis", "If you don't like coffee, Starbucks won't satisfy you. Try the #java @treehouse. It is a true #treet.",
                new Date(14784862100l));
        
        Treet sixthTreet = new Treet("craigdennis", "It is a true #treet when you return to your #java code and have clarity, or sleep, you can get your code to work. @kenwalger.",
                new Date(14784862100l));
        
        Treet seventhTreet = new Treet("craigdennis", "private String[] forJava = {Hip,Hip}; There's my Hip Hip Array forJava. Another #treet for #java",
                new Date(14784862100l));    

        //System.out.println(treet.toString());
        //Object obj = treet;
        //Treet another = (Treet) obj;
        //Object[] someStuff = {treet, "a string"};

        Treet[] treets = {secondTreet, treet, thirdTreet, 
                fourthTreet, fifthTreet, sixthTreet, seventhTreet};
        Arrays.sort(treets);
        //for(Treet exampleTreet : treets) {
            //System.out.println(exampleTreet);
        //}
        
        Treets.save(treets);
        Treet[] reloadedTreets = Treets.load();
        for(Treet reloaded : reloadedTreets) {
            System.out.println(reloaded);
        }
        System.out.printf("There are %d treets. %n",
                treets.length);
        Treet originalTreet = treets[0];
        System.out.println("Hashtags: " + originalTreet.getHashTags());
        
       System.out.println("----------Sets Chapter -------");
       //Set<String> allHashTags = new HashSet<String>();
       //Set<String> allHashMentions = new HashSet<String>();
       Set<String> allHashTags = new TreeSet<String>();
       Set<String> allHashMentions = new TreeSet<String>();
       for(Treet t : treets) {
           allHashTags.addAll(t.getHashTags());
           allHashMentions.addAll(t.getHashMentions());
       }
       System.out.printf("Hash tags: %s %n", allHashTags);
       System.out.printf("Hash mentions: %s %n", allHashMentions);
       
       Map<String, Integer> hashTagCounts = new HashMap<String, Integer>();
       for (Treet t : treets) {
           for (String hashTag : treet.getHashTags()) {
               Integer count = hashTagCounts.get(hashTag);
               if (count == null) {
                   count = 0;
               }
               count++;
               hashTagCounts.put(hashTag, count);
           }
       }
       System.out.printf("Hash tag counts: %s %n", hashTagCounts);
       
       Map<String, List<Treet>> treetsByAuthor = new HashMap<String, List<Treet>>();
       for(Treet t : treets) {
           List<Treet> authoredTreets = treetsByAuthor.get(treet.getAuthor());
           if(authoredTreets == null) {
               authoredTreets = new ArrayList<Treet>();
               treetsByAuthor.put(t.getAuthor(), authoredTreets);
           }
           authoredTreets.add(t);
       }
       
       System.out.printf("Treets by author: %s %n ", treetsByAuthor);
       System.out.printf("Treets by craigdennis: %s %n", treetsByAuthor.get("craigdennis"));
       
    }
}
