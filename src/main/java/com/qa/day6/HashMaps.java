package com.qa.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {
    public static void hashMapsExercise() {
        Map<String, String> capitalCities = new HashMap<>();
        //add to hashmap
        capitalCities.put("A", "London");
        capitalCities.put("B", "Paris");
        capitalCities.put("C", "Edinburgh");
        System.out.println("What's the value for the key A? Answer: " + capitalCities.get("A"));
        System.out.println("What's the size of the hashmap? " + capitalCities.size());
        //loop through keys of hashmap
        for(String i : capitalCities.keySet()) {
            System.out.println("Key: " + i);
        }
        //loop through values of hashmap
        for(String i : capitalCities.values()) {
            System.out.println("Value: " + i);
        }
        //loop over entry set, prints key and value pair
        for(Entry<String, String> i : capitalCities.entrySet()) {
            System.out.println("hashmap entries: " + i);
        }
        //use .clear() to empty the hashmap
    }

    public static void main(String[] args) {
        hashMapsExercise();
    }
}
