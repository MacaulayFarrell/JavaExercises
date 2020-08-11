package com.qa.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
    //Arraylist exercise
    public static List<String> modules = new ArrayList<>();
    public static void list() {
        //add elements
        modules.add("Version Control");
        modules.add("HTML");
        modules.add("CSS");
        modules.add("Cloud Fundamentals");
        //normal for loop
        for(int i = 0; i < modules.size(); i++ ) {
            System.out.println(modules.get(i));
        }
        //Enhanced for loop
        for(String i : modules) {
            System.out.println(i);
        }
        //get elements
        System.out.println(modules.get(1));
        System.out.println(modules.get(2));
        //set elements, e.g. change value
        modules.set(1, "Project management");
        System.out.println(modules);
        //remove elements
        modules.remove(1);
        System.out.println(modules);
        //sort method
        Collections.sort(modules);
        System.out.println("sorted: " + modules);
        //get arraylist size
        System.out.println("ArrayList elements: " + modules.size());

    }

    public static void main(String[] args) {
        list();
    }
}
