package com.sandbox;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.*;

public class LambdaSandbox {

    public static void main(String[] args) {

        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
        "Uranus", "Neptune"};
        logInfoMessage(Arrays.toString(planets));

        logInfoMessage("Sorted in dictionary order..");
        Arrays.sort(planets);
        logInfoMessage(Arrays.toString(planets));

        logInfoMessage("Sorted by length..");
        Arrays.sort(planets,
                (first, second) -> first.length() - second.length());
        logInfoMessage(Arrays.toString(planets));

        //Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        //t.start();

        //JOptionPane.showMessageDialog(null, "Quit program?");
        //System.exit(0);

        //Timer t = new Timer(1000, System.out::println);
        //t.start();

        List<String> convertedList = Arrays.asList(planets).stream()
                .map(String::toLowerCase).collect(Collectors.toList());
        convertedList.stream().forEach(System.out::println);

        List<String> convertedList2 = Arrays.asList(planets).stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        convertedList2.stream().forEach(System.out::println);


    }

    public static void logInfoMessage(String msg) {
        System.out.println("");
        System.out.println(msg);
        System.out.println("");
    }
}
