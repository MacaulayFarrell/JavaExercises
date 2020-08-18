package com.qa.day6;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void hashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("welcome");
        hashSet.add("doing it");
        System.out.println("Size of hashSet: " + hashSet.size());
        System.out.println("Is the set empty? " + hashSet.isEmpty());
        hashSet.remove("hello");

        for(String i : hashSet) {
            System.out.println("Element: " + i);
        }
        System.out.println("Does it contain element hello? " + hashSet.contains("welcome"));


    }
    public static void main(String[] args) {
        hashSet();

    }
}
