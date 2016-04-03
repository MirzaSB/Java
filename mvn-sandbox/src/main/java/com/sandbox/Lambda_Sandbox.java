package com.sandbox;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.function.Consumer;

public class Lambda_Sandbox {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> text = Arrays.asList("test1", "test2", "test3");

        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer value) {
                value++;
                value--;
                System.out.println(value);
            }
        });

        System.out.println("-----------");

        numbers.forEach(
                (value) -> {
                    System.out.println("From Lambda..");
                    System.out.println(value);
                });

        text.forEach(
                (s) -> {
                    s = "From Lambda --> " + s;
                    System.out.println(s);
                });

        String[] planets = new String[] {"Mercury", "Venus", "Earth",
        "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));

    }
}
