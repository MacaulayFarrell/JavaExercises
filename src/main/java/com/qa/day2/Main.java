package com.qa.day2;

public class Main {
    public static void main(String[] args) {
        //create Person object and output value
        Person macaulay = new Person();
        macaulay.setFirstName("Macaulay");
        macaulay.setLastName("Farrell");
        System.out.println(macaulay.getFirstName());
        System.out.println(macaulay.getLastName());
    }
}
